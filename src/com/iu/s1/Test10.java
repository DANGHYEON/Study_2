package com.iu.s1;

import java.util.Scanner;

public class Test10 {
	
	public static void main(String[] args) {
		
		System.out.println("===Test10 Start===");
		
		// 0 -> 0
		// 1 -> 1
		// 2 -> 2
		// 3 -> 3
		// 4 -> 10
		// 5 -> 11
		// 6 -> 12
		// 7 -> 13
		// 8 -> 20
		// 9 -> 21
		// 10 -> 22
		// 11 -> 23
		// 12 -> 30
		// 13 -> 31
		// 17 -> 41
		
		
		
		//실행 중에 데이터 입력받을 준비
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
		
		
		int num = 12;
		
		num = sc.nextInt();
		
		int result=0;
		
		// result = num/4*10+num%4;
		
		result = (num/4)*6+num;
		System.out.println(result);
		
		
		
		
	}

}
