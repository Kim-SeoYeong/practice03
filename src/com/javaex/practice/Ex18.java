package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=num; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=2; i<=num; i++) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
//		for(int i=1; i<num; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.print("*");
//			System.out.println("");
//		}
		sc.close();
	}

}
