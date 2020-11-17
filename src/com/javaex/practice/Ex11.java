package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			if (num%2==0) {
				if (i%2==0) {
					result = result + i;
				}
			} else if (num%2!=0) {
				if (i%2!=0) {
					result = result + i;
				}
			}
		}
		
		System.out.println("결과값 : " + result);
		
		sc.close();
	}

}
