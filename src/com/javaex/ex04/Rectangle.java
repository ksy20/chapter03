package com.javaex.ex04;

public class Rectangle {
	
	private int width;
	private int height;
	
	public Rectangle() {
	}

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	private int getWidth() {
		return width;
	}

	private void setWidth(int width) {
		this.width = width;
	}

	private int getHeight() {
		return height;
	}

	private void setHeight(int height) {
		this.height = height;
	}

	@Override
	public boolean equals(Object obj) {
		Rectangle r = (Rectangle)obj;
		if(width==r.width && height==r.height) {
			return true;
		}else {
			return false;
		}
		
	}
	
	

}
