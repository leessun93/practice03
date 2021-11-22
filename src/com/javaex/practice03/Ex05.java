package com.javaex.practice03;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		boolean flag = true;
		
		while(flag) {
			if(i>=5) {
				flag=false;
			}
			System.out.println(i);
			i=i+1;
		}
	}
	// flag 값은 트루다. if의 i값이 5보다 크면 false가 되기때문에 와일의 값은 1부터 1씩더한 1 2 3 4  4가지 값을 갖는다.
	//틀림
}
