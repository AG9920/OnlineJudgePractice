package com.futuregong;

import java.util.Scanner;

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
