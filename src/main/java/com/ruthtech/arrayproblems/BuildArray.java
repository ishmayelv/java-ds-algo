package com.ruthtech.arrayproblems;

public class BuildArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    
	
}
class MyArray {
	int ARRAY_DEFAULT_SIZE=10;
	int length;
	Integer[] data;
	 
	int getLength() {
		return this.length;
	}
	void  insertElement(Integer ele) {
		if(data==null) {
			data=new Integer [ARRAY_DEFAULT_SIZE];
		}
		
		data[this.length]=ele;
		//return this.length++;	
	}
}


