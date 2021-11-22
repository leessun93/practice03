package com.javaex.practice03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int result = 0;
		int x = 1;
		
		
		if(num%2==0) {
		
			while (x<=num) {
		
			
			if(x%2==0) {
				result = result+x;
			}
			x++;
		}
		
		}else {
			while (x<=num) {
				
		
				
				if(x%2!=0) {
					result = result+x;
				
		}
		
				x++;
				
		
		
			}
		
			System.out.println(result);
		}
		
		System.out.println(result);
		
		
		sc.close();

	}

}
