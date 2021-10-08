package com.ruthtech.warmup;

public class SortArray {
	public static void main(String[] args) {
		int arr[] = { 38,4,27,43,9,82,10,3};
		System.out.println("Given Array Merge sort "); 
		//printArray(arr); 		
		//mergeSort(arr, arr.length);
		//printArray(arr); 
		
		
		
		int arr2[] = { 38,5,27,43,9,82,10,11,3};
		System.out.println("Given Array Quick sort "); 
		printArray(arr2); 		
		quickSort(arr2,0,arr.length);
		printArray(arr2); 
	}
	private static void quickSort(int []iArray, int l, int r) {
		if(l>=r) return;
		
		int pivot = iArray[(l+r)/2];
		
		int index = shaful(iArray, l, r, pivot);
		quickSort(iArray, l, index-1);
		quickSort(iArray, index, r);
		
	}
	
	public int[] twoSum(int[] nums, int target) {
        int result[]=new int[2];
        if(nums.length<2) return result;	        
        
        for(int i=0; i<nums.length; i++){
            for(int j=i+1;j<nums.length;j++){
              if(nums[i]+nums[j] == target){
                  result[0]=i;
                  result[1]=j;
                  break;
              }                  
            }
        }
        return result;
	}
	        
	
	private static int shaful(int []iArray, int l,int r, int pivot) {
		
		while(l<=r) {			
			while(iArray[l]< pivot)
				l++;
			while(iArray[r]>pivot)
				r--;
			
			if(l<=r) {
				int temp= iArray[l];
				iArray[l]=iArray[r];
				iArray[r]=temp;
				l++;
				r--;
			}			
		}
		return l;
			
		
	}
	
	
	
	private static void mergeSort(int iArray[], int arrayLen) {
		if(arrayLen<2) return;
		
		int mid = arrayLen/2;
		
		int leftArray[] =new int[mid];
		int rightArray[] =new int[arrayLen-mid];
		
		for(int i=0; i<mid ;i++)
			leftArray[i]=iArray[i];
		
		for(int j=mid; j<arrayLen ;j++)
			rightArray[j-mid]=iArray[j];
		
		mergeSort(leftArray,mid);
		mergeSort(rightArray,arrayLen-mid);
		merge(iArray,leftArray,rightArray);		
	}
	
	private static void merge(int iArray[], int leftArray[], int rightArray[])
	{
		int i=0, j=0, k=0;
		while(i<leftArray.length && j<rightArray.length) {
			if(leftArray[i]<= rightArray[j])
				iArray[k++] =leftArray[i++];
			else
				iArray[k++] =rightArray[j++];
		}
		while(i<leftArray.length )
			iArray[k++] =leftArray[i++];
		
		while(j<rightArray.length )
			iArray[k++] =rightArray[j++];
	}	
	private static void printArray(int arr[]){ 
		int n = arr.length; 
		for (int i = 0; i < n; ++i) 
			System.out.print(arr[i] + " "); 
		System.out.println(); 
	}	

	

}
