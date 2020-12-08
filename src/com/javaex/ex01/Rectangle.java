package com.javaex.ex01;

public class Rectangle {

	private int width, height;

	public Rectangle() {

	}

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void draw() {
		System.out.println("사각형 [" + "가로: " + width + " 세로: " + height + "] 을(를) 그렸습니다.");
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

}
