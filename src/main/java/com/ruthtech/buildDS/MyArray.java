package com.ruthtech.buildDS;

public class MyArray {

	
	private int length=0;
	private String[] data;
	
	MyArray(int initialize){
		this.length=0;
		this.data= new String[initialize];
	}
	
	public int add(String element) {
		this.data[this.length]=element;
		this.length++;
		return this.length;
	}
	
	public String get(int index) {
		if (index>=0 && index<this.length)
			return data[index];
		else
			return "WRONG INDEX";
	}
	
	public String delete(int index) {
		if (index>=0 && index<this.length) {
			return data[index]="";
		}
		else
			return "WRONG INDEX";
	}
	
	private void shiftIndex() {
		
	}
	
	
	public static void main(String[] args) {
		MyArray myArray = new MyArray(10);
		
		myArray.add("ishmayel");
		myArray.add("serena");
		
		myArray.delete(1);
		
		System.out.println("0 "+myArray.get(0));
		System.out.println("1 "+myArray.get(1));
		
	}
    
	
}
