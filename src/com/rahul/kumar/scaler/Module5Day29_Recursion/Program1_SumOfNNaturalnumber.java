package com.rahul.kumar.scaler.Module5Day29_Recursion;

import java.util.Scanner;

public class Program1_SumOfNNaturalnumber {

	static int sumNumber(int num) {
		if(num ==0)
			return 0;
		return sumNumber(num-1)+num;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println(sumNumber(num));
		
	}
}
