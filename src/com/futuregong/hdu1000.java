package com.futuregong;

import java.util.Scanner;

/*
 * A + B Problem

Time Limit: 2000/1000 MS (Java/Others)    Memory Limit: 65536/32768 K (Java/Others)
Total Submission(s): 569036    Accepted Submission(s): 180684


Problem Description
Calculate A + B.
 

Input
Each line will contain two integers A and B. Process to end of file.
 

Output
For each case, output A + B in one line.
 

Sample Input
1 1
 

Sample Output
2
 */

public class hdu1000 {
	
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			a=Integer.parseInt(sc.next());
			b= Integer.parseInt(sc.next());
			System.out.println(a+b);
		}
	}

}
