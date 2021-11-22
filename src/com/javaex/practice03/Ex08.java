package com.javaex.practice03;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan = 2;
		int num = 1;
		for(int x=1; x<=9; x++) {
			
			for(int y=1; y<9; y++) {
				System.out.print(dan + "*"+num+"="+dan*num);
				System.out.print("   ");
				dan = dan+1;
			}
			System.out.println("");
			num = num+1;
			dan = 2;
		}
				
	}

}
