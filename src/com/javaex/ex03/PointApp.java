package com.javaex.ex03;

public class PointApp {

	public static void main(String[] args) {
		Point a = new Point(2,3);
		Point b = new Point(2,3);
		Point c = new Point(5,7);
		Point d = c;
		
		System.out.println(a==b);
		System.out.println(c==d);
		System.out.println("=====================");
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println();
	}
	


}