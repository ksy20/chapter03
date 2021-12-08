package com.javaex.ex05;

public class RectangleApp {

	public static void main(String[] args) {
		
		Rectangle a = new Rectangle(6,4);
		Rectangle b = new Rectangle(6,4);
		Rectangle c = new Rectangle(12,2);
		Rectangle d = new Rectangle(3,8);
		Rectangle e = new Rectangle(12,4);
		
		Area[] rArray = new Area[5];
		
		rArray[0] = a;
		rArray[1] = b;
		rArray[2] = c;
		rArray[3] = d;
		rArray[4] = e;
		
		for (int i=0; i<rArray.length; i++) {
			rArray[i]
		}
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(a.equals(e));
		System.out.println(d.equals(e));
	}

}
