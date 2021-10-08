package com.ruthtech.ds;

import java.util.ArrayList;

public class HashTable {	
	class KeyValue{
		private String key;
		private String value;
		KeyValue(String key, String value){
			this.key=key;
			this.value=value;
		}
		public String getKey() {
			return key;
		}
		public void setKey(String key) {
			this.key = key;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}		
	}
	
	
	int size;
	ArrayList<KeyValue> buckets[];
	
	HashTable(int size){
		buckets = new ArrayList[size];
	}
	
	private int hash(String key) {
	    int hash = 0;
	    for (int i =0; i < key.length(); i++){
	        hash = (hash + key.codePointAt(i)) % buckets.length;
	    }
	    return hash;
	}
    
	
	 private void put(String key, String val){
		int hashCode = hash(key);
		System.out.println("add hashCode :"+hashCode);
		if (buckets[hashCode]==null)	
			buckets[hashCode] = new ArrayList<KeyValue>();
		
		KeyValue kv = new KeyValue(key,val);
		buckets[hashCode].add(kv);
	}
	 
	private String get(String key) {
		int hashCode = hash(key);		
		ArrayList<KeyValue> kvList = buckets[hashCode];
		for(KeyValue kv:kvList) {
			if (kv.getKey().equals(key))
				return kv.getValue();				 
		}
		return null;
	}
	
	 
	public static void main(String[] args) {
		HashTable ht =new HashTable(10);  
		
		ht.put("one", "value One");
		ht.put("two", "value two");
		ht.put("three", "value three");
		ht.put("four", "value four");
		
		System.out.println("One -->"+ht.get("one"));

	}

}
