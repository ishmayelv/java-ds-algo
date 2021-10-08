package com.ruthtech.ds;

import java.util.ArrayList;

public class HashTableFresh {

	class KeyValue{
		private String key;
		private String val;
		
		KeyValue(String key, String value){
			this.key=key;
			this.val=value;
		}
		public String getKey() {
			return key;
		}
		public void setKey(String key) {
			this.key = key;
		}
		public String getValue() {
			return val;
		}
		public void setValue(String val) {
			this.val = val;
		}	
		
	}
	
	int bucketSize;
	ArrayList[] bucketList; 
	
	private int hash(String key) {
		int hash=0;
		for(int i=0;i<key.length(); i++)
			hash = (hash + key.codePointAt(i)) % bucketSize;
		return hash;
	}
	
	HashTableFresh(int size){
		bucketList = new ArrayList[size];
		bucketSize = size;
	}
	
	private void put(String key,String value) {
		int hashCode = hash(key);
		
		if( bucketList[hashCode]== null)
			bucketList[hashCode]=new ArrayList<KeyValue>();
		 
		bucketList[hashCode].add(new KeyValue(key, value)); 
	}
	
	private KeyValue get(String key) {
		KeyValue keyValue=null;
		int hashCode = hash(key);		 
		ArrayList<KeyValue> keyValueList =  bucketList[hashCode]; 
		if(keyValueList!=null) {		 
			for(KeyValue keyVal:keyValueList) {
				if(keyVal.getKey().equals(key)) {
					keyValue= keyVal;
					break;
				}
			}
		}
		return keyValue;
	}
	
	
	public static void main(String[] args) {
		HashTableFresh ht =new HashTableFresh(10);  		
		ht.put("one", "value One");
		ht.put("two", "value two");
		ht.put("two", "value two1");
		ht.put("three", "value three");
		ht.put("four", "value four");
		
		System.out.println("One -->"+ht.get("one").getValue());
		 
		System.out.println("ten -->"+ ht.get("ten"));
		 
	}

}
