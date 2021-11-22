package com.javaex.practice03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int i = 1;
		for(int x=1; x<=num; x++) {
			
			for(int y=1; y<x; y++) {
				System.out.print(i);
				
			}
			System.out.println(i++);

		}
	
		
		sc.close();
	}

}
