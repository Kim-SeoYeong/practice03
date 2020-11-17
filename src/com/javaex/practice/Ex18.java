package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for문을 1번 이용해서 풀었을 경우
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
	    for(int i=1 ; i <= (num * 2) - 1 ; i++) {
	        if(i <= num) { // 1 ~ 3
	            for(int j=0 ; j <= (num - i) ; j++) {
	                System.out.print("*");
	            }
	        } else {
	            for(int j=0 ; j <= (i - num) ; j++) {
	                System.out.print("*");
	            }
	        }
	        System.out.println("");
	    }

	    //for문을 두번 이용해서 풀었을 경우!!!
//		for(int i=1; i<=num; i++) {
//			for(int j=num; j>=i; j--) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		for(int i=2; i<=num; i++) {
//			for(int j=i; j>0; j--) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
	    
//----------------------------------------------------------		
	    //ㅋㅋ이건 별로인 코드..
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
