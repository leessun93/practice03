package com.javaex.practice03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int max= 0;
		
		for(int x=1; x<=5; x++) {
		
			System.out.println("숫자입력해");
			int num = sc.nextInt();
			
			
			
			if(max<num) {
				
				max = num;
			}
			
			
			
			
			
			
			
		}
		
		
		
		System.out.println("가장큰수는"+max);
		
		
		
		
		
			sc.close();
		}
	
}

