package com.rahul.kumar.Day5PatternQuestion.com;

import java.util.Scanner;

public class PrintStarPatternAsShown3 {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number :");
	int num = sc.nextInt();
	for(int i=1;i<=num;i++) {
		System.out.print("*");
		for(int j=1;j<=num-i;j++) {
			System.out.print(" ");
		}
		System.out.print("*");
		System.out.println();
	}
}
}




// for n = 3

//   * _ _ *
//   * _ * _
//   * *