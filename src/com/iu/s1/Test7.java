package com.iu.s1;

public class Test7 {
	public static void main(String[] args) {
		System.out.println("===Test7 Strat===");
		int kor = 56;
		int eng = 65;
		int math = 49;
		int total = kor + eng + math;
		double avg = total/3.0;
		
		System.out.println("Total : "+ total);
		System.out.println("Avg : "+ avg); // 56.66664
		
		avg = avg*100;
		int result = (int)avg;
		avg = result / 100.0;
		
		
	
		kor = 100;
		System.out.println("Total : "+ total);
		System.out.println("Avg : "+avg); //56.66
		
	}
}
