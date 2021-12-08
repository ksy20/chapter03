package com.javaex.ex06;

public class StringApp01 {

	public static void main(String[] args) {
		
		String str01 = new String ("hi");
		String str02 = new String ("hi");

		System.out.println(str01 == str02); //false  주소값을 비교
		
		System.out.println(str01.hashCode());
		System.out.println(str02.hashCode());
		System.out.println("==========================");
		
		String str03 = "hello"; //new String 으로 썼을때와 메모리에 올라오는 값이 다름
		String str04 = "hello"; //이렇게 쓰면 똑같은 값이 있는지 찾고 같은 값이 있다면 그 값에 자신의 주소를 발들여놈.
		
		
		System.out.println(str03==str04); // 그래서 같은 값에 주소를 발들여놔서 여기에는 true
		
		str03 = "hello!!!!"; //이렇게 값을 바꿔주면 04는 발을 뺴고 자신의 주소를 만듦


		System.out.println(str03==str04);
		System.out.println(str03.hashCode());
		System.out.println(str04.hashCode());
		
		System.out.println(str04.hashCode());
	}
	

		
		
		

}
