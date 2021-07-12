package com.iu.s1;

public class Test6 {

	public static void main(String[] args) {
		System.out.println("=== Test6 Start ===");
		
		int num = 5;
		double num2 = 3.12;
		num = num + (int)num2;
		System.out.println("Num : "+num);
		
		int kor = 63;
		int eng = 35;
		int math = 53;
		int total;
		
		total = kor + eng + math;
		
		System.out.println("Total : " + total);
		
		
		
		// 50.0이 나온 이유 : 정수 나누기 정수여서 
		double ave = (double)total/3;
		
		System.out.println("Average : " + ave);
		
		double num3 = 5.124;
		int result = (int)num3;
		System.out.println("Num3 : " + result);
		
		
	}
}
