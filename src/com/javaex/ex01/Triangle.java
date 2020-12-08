package com.javaex.ex01;

public class Triangle {

	private int width, height;

	public Triangle() {
		super();
	}

	public Triangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public void draw() {
		System.out.println("삼각형 [" + "가로: " + width + " 세로: " + height + "] 을(를) 그렸습니다.");
	}

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}

}
