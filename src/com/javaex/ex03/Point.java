package com.javaex.ex03;

public class Point {
	
	private int x;
	private int y;
	
	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	private int getX() {
		return x;
	}

	private void setX(int x) {
		this.x = x;
	}

	private int getY() {
		return y;
	}

	private void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		
//		System.out.println("a.x= " + this.x);
//		System.out.println("a.y= "+ this.y);
//		
//		System.out.println("b.x= "+ p.x);
//		System.out.println("b.y= "+ p.y);
		if(this.x==p.x && this.y==p.y) {
			return true;
		}else {
			return false;
		}
			
		//return super.equals(obj);
	}
	
	
	
}
