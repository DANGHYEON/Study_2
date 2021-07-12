package com.iu.s1;

public class Test5 {
	public static void main(String[] args) {
		
		System.out.println("===Test5 Start===");
		int num1 = 3;
		long num2 = 9L;
		System.out.println("Num1  : "+num1);
		
		num1 = (int)num2;  
		
		System.out.println("Num1  : "+num1);
		
		num1 = 3;
		
		//num2 = (long)num1;
		num2 = num1;
		System.out.println("Num2  : "+num2);
		
		char ch = '1';
		int num3 = ch;
		System.out.println(num3);
		
		ch = (char)(num3+21);
		
		//형변환은       int < long < float < double
		long num4=10L;  // 8byte
		float f1 = num4;   // 4byte
		System.out.println(num4);
	}
	

}
