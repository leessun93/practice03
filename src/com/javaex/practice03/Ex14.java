package com.javaex.practice03;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int result=0;
		int i;
		for(i=1; i<=num; i++) {
			
			
			result= result + i;
	
			
		}
		for(int x=0; x<num; x++) {
			System.out.print(x);
			System.out.print("+");
		}
		System.out.println(num);
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
