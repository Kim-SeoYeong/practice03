package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random = (int)(Math.random()*100)+1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("===========================");
		System.out.println("   [숫자맞추기게임 시작]   ");
		System.out.println("===========================");
		
		while(true) {
			System.out.print(">> ");
			int num = sc.nextInt();
			
			if (num>random) {
				System.out.println("더 낮게");
			} else if (num<random) {
				System.out.println("더 높게");
			} else if (num==random) {
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까?(y/n) >> ");
				char game = sc.next().charAt(0);
				
				if (game == 'y' ) {
					System.out.println("===========================");
					System.out.println("   [숫자맞추기게임 종료]   ");
					System.out.println("===========================");
					break;
				}
			}
		}
		
		sc.close();
	}

}
