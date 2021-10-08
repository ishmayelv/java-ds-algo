package com.ruthtech.warmup;
class Solution {
    public static int[] rotate(int[] nums, int k) {
        int temp[] = new int[nums.length];
        int j=0;
        
        for(int i=k+1 ; i< nums.length ; i++){
            temp[j]=nums[i];
            j++;
        }
        
        for(int i=0 ; i< k+1 ; i++){
            temp[j]=nums[i];
            j++;
        }
        nums=temp;
        
        for(int i: temp) {
    		System.out.print(i+"\t");
    	}
        return temp;
    }
    public static void main(String arg[]) {
    	int a[]= {1,2,3,4,5,6,7};
    	a= rotate(a,3); 
    	System.out.println("");
    	for(int i: a) {
    		System.out.print(i+"\t");
    	}
    }
}