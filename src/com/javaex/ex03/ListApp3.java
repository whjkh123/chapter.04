package com.javaex.ex03;

public class ListApp3 {

	public static void main(String[] args) {

		MyList<Rectangle> rList = new MyList<Rectangle>();// 메모리 로딩 제약 <Rectangle>

		Rectangle r01 = new Rectangle(5, 5);
		Rectangle r02 = new Rectangle(10, 10);

		rList.add(r01);
		rList.add(r02);

		for (int i = 0; i < rList.size(); i++) {
			rList.get(i).draw();
		}

		System.out.println("=========================================");

		MyList<Circle> cList = new MyList<Circle>();// 메모리 로딩 제약 <Circle>

		Circle c01 = new Circle(7);
		Circle c02 = new Circle(10);

		cList.add(c01);
		cList.add(c02);

		for (int i = 0; i < cList.size(); i++) {
			cList.get(i).draw();
		}

		System.out.println("=========================================");

		MyList<Triangle> tList = new MyList<Triangle>();// 메모리 로딩 제약 <Triangle>

		Triangle t01 = new Triangle(5, 5);
		Triangle t02 = new Triangle(10, 10);

		tList.add(t01);
		tList.add(t02);

		for (int i = 0; i < tList.size(); i++) {
			tList.get(i).draw();
		}

	}

}
