package com.rahul.kumar.scaler.Module4Day21BitManipulation;

public class Program1_GivenTwoBinaryStringReturnTheSumInBinary {

	static void binarySum(String a, String b) {
		int i = a.length()-1;
		int j = b.length()-1;
		int carry = 0;
		String result = "";
		
		while(i>=0 || j>=0 || carry!=0) {
			int sum =carry;
			if(i>=0) {
				sum += a.charAt(i) -'0';
				i--;
			}
			if(j>=0) {
				sum += b.charAt(i) - '0';
				j--;
			}
			result = sum%2 +result;
			carry = sum/2;
		}
		System.out.println(result);
	}
	public static void main(String[] args) {
		String a = "110";
		String b = "11";
		binarySum(a,b);
	}
}
