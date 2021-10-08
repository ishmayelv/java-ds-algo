package com.ruthtech.arrays;

public class ContainsDuplicates {
	//Easy
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,2,3,1};
	 boolean result=	containsDuplicate(nums);
	 System.out.println("result:"+result);
	}
	private static boolean containsDuplicate(int[] nums) {
        boolean result=false;
        for(int i=0;(i<nums.length && result==false) ;i++){
            for(int j=i+1;j < nums.length;j++){
                if(nums[i]==nums[j]){
                    result=true;
                    break;
                }                
            }
         }  
        return result;
    }
}
