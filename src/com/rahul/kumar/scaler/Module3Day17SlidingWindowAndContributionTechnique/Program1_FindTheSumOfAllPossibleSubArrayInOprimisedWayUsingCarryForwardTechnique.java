package com.rahul.kumar.scaler.Module3Day17SlidingWindowAndContributionTechnique;

public class Program1_FindTheSumOfAllPossibleSubArrayInOprimisedWayUsingCarryForwardTechnique {

	static void sumSubArr(int []arr) {
		int totalSum =0;
		for(int s=0;s<arr.length;s++){
			 int arrSum =0;
			 for(int e=s;e<arr.length;e++) { 
				 arrSum +=arr[e];
				 totalSum += arrSum;                  // TC = O[N^2]          SC = O[1]
			 }
	     }
		System.out.println("Total sum of subArray is : "+totalSum);
	}
	public static void main(String[] args) {
		int []arr = {3,2,5};
		sumSubArr(arr);
	}
}
