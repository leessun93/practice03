package com.javaex.practice03;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int a = sc.nextInt();
		int besu = a/5;
		int besuhap = 0;
		
		for(int x=1;x<=a;x++) {
		
			if(x%5==0) {
				besuhap= besuhap+x;
			}
		
			
		}
		System.out.println("5배수 개수 :" + besu);
		
		System.out.println("5의 배수의 합" + besuhap);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
