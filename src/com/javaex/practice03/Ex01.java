package com.javaex.practice03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("while 문");
		int index = 0;
		while (index<3) {
			System.out.println("index"+index);
			index++;
		}
		System.out.println("for문");
		for(int order=0; order<3;order++) {
			System.out.println("order="+order);
		}
		
		//결과 인댁스는 0부터 3미만까지이니 결과는 인덱스0 인덱스1 인덱스2 이다
		//포문은 오더 0부터 3미만까지이니 결과는 오더0 오더1 오더2 이다
		
		
		
		
		sc.close();

	}

}
