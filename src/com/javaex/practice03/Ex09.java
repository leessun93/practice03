package com.javaex.practice03;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1;
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				System.out.print(num++ +"\t");
			
			}
			System.out.println("");
			num = num-9;
		}
	}

}
