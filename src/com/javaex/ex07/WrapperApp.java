package com.javaex.ex07;

public class WrapperApp {

	public static void main(String[] args) {
		
		int no = 10;
		Integer i = new Integer(10);
		Short s = new Short((short)3);
		Byte b = new Byte((byte)3);
		
		System.out.println(no);
		System.out.println(i);
		System.out.println(s);
		System.out.println(b);
		
		int num01 = 10;
		int num02 = 7;
		int intResult = num01+num02;
		
		System.out.println(intResult);
		
		Integer i01 = new Integer(10);
		Integer i02 = new Integer(7);
		Integer result = i01+i02;
		
		System.out.println(result);
		
		Integer i03 = 99; //Integer은 new Integer 을 해줘햐하는데 안해줘도 내부적으로 해줌 하지만 저게 생략되어 있다는걸 알아야함
		
		Integer i04 = new Integer(100);
		int num99 = i04; //이렇게 하면 integer가 int에게 맞춰서 숫자만 들어감 이걸ㄹ unboxing 이라고 함.
		
		//문자열 --> int 로 바꾸기
//		Integer i05 = 10; //?????????
//		int r01 = i05.parseInt("12345");
//		System.out.println(r01);
		
		int r01 = Integer.parseInt("12345");
		
		System.out.println(r01);
		
		//int --> 문자열로 바꾸기 
		
//		String a = "안녕하세요";
//		String snum = a.valueOf(555);
//		System.out.println(snum);
		String snum = String.valueOf(555);
		System.out.println(snum);
		
		String r100 = ""+555;
		System.out.println(r100);
		
	}

}
