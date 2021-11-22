package com.javaex.practice03;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		
		while(i<=100) {
			
			i=i+1;
			
			if((i%7==0) && (i%5==0)) {
				System.out.println(i);
				
			}
		}
	}

}
