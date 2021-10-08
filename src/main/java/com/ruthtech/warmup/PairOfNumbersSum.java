package com.ruthtech.warmup;

public class PairOfNumbersSum {

	public static void main(String[] args) {
		int ipArray1[]= {1,2,3,9};
		int ipArray2[]= {1,2,4,4};
		//sum -> 8
		int sum=8;		
		System.out.println("Input1 :"+findPairOfSumNave(ipArray1,sum));
		System.out.println("Input2 :"+findPairOfSumNave(ipArray2,sum));
	}
	
	private static boolean findPairOfSumNave(int []input, int pairSum) {		
		if(input!=null & input.length>1){
			for(int i=0;i<input.length;i++)
				for(int j=0;j<input.length;j++) {
					if( (input[i] + input[j]) ==pairSum )
						return true;
				}
		}
		return false;
	}
	
	
	
	
}
