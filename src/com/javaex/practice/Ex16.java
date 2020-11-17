package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		int j=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			if(i%5==0) {
				//5의 배수 개수 카운트
				j++;
				//5의 배수의 합
				result = result + i;
			}
		}
		System.out.println("5의배수의 개수 : " + j);
		System.out.println("5의배수의 합 : " + result);
		
		sc.close();
	}

}
