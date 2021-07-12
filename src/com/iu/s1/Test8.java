package com.iu.s1;

public class Test8 {
	public static void main(String[] args) {
		System.out.println("=== Test8 Start ===");
		
		// 무인편의점 흉내
		// 물건을 고른 후 바코드로 찍는다.
		// 물건값의 합계가 나온다. -> 현금만 되는 곳. -> 거스름돈을 줘야한다.
		// 물건 값의 합계보다 손님이 낸 돈이 더 많다라는 가정.
		
		
		//물건 값의 합계
		int price = 28520;
		//손님이 낸 돈
		int money = 100000;
		//거스름돈
		int don = money - price;
		
		
		// 1.
		System.out.println("물건 값의 합계 : "+price + " 손님이 낸 돈 : " +money + " 거스름 돈 : " + don);
		
		// 만원짜리 개수를 담을 변수
		int man;
		// 천원짜리 개수를 담을 변수
		int cheon;
		// 백원짜리 개수를 담을 변수
		int back;
		// 십원짜리 개수를 담을 변수
		int sip;
		
		
		
		man = don/10000;
		cheon = don%10000/1000;
		back = don%1000/100;
		sip = don%100/10;
		
		System.out.println("만원 : "+man+ "장");
		System.out.println("천원 : "+cheon+ "장");
		System.out.println("백원 : "+back+ "개");
		System.out.println("십원 : "+sip+ "개");
		
		
		
		
		
		
		
		
	}

}
