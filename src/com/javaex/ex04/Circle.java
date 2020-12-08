package com.javaex.ex04;

public class Circle {

	private int radius;

	public Circle() {

	}

	public Circle(int radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("원 [반지름: " + radius + "] 을(를) 그렸습니다.");
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
