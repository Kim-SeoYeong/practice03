package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1~100까지 수 중에서 5의배수 이면서 7의 배수인 수를 출력
		for(int i=1; i<=100; i++) {
			if((i%5==0) &&(i%7==0)) {
				System.out.println(i);
			}
		}
	}

}
