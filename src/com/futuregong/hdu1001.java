package com.futuregong;

import java.util.Scanner;

/*
 * Sum Problem

Time Limit: 1000/500 MS (Java/Others)    Memory Limit: 65536/32768 K (Java/Others)
Total Submission(s): 409390    Accepted Submission(s): 102946


Problem Description
Hey, welcome to HDOJ(Hangzhou Dianzi University Online Judge).

In this problem, your task is to calculate SUM(n) = 1 + 2 + 3 + ... + n.
 

Input
The input will consist of a series of integers n, one integer per line.
 

Output
For each case, output SUM(n) in one line, followed by a blank line. You may assume the result will be in the range of 32-bit signed integer.
 

Sample Input
1
100
 

Sample Output
1

5050
 

 */

public class hdu1001 {
	
	
	public static void main(String[] args) {
		int result ;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			result = sc.nextInt();
			System.out.println(sum(result));
			System.out.println();
		}
	}
	
	public static int sum(int n){
		int total=0;
		for(int i=0;i<=n;i++){
			total+=i;
		}
		return total;
	}

}
