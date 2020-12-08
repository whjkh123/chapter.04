package com.javaex.ex02;

public class ListApp2 {

	public static void main(String[] args) {

		ObjList rList = new ObjList();

		Rectangle r01 = new Rectangle(3, 3);
		Rectangle r02 = new Rectangle(5, 5);

		rList.add(r01);
		rList.add(r02);

		for (int i = 0; i < rList.size(); i++) {
			((Rectangle) (rList.get(i))).draw();
		}

		System.out.println("=========================================");

		ObjList cList = new ObjList();

		Circle c01 = new Circle(5);
		Circle c02 = new Circle(10);

		cList.add(c01);
		cList.add(c02);

		for (int i = 0; i < cList.size(); i++) {
			((Circle) (cList.get(i))).draw();
		}

		System.out.println("=========================================");

		ObjList tList = new ObjList();

		Triangle t01 = new Triangle(19, 92);
		Triangle t02 = new Triangle(11, 03);

		tList.add(t01);
		tList.add(t02);

		for (int i = 0; i < tList.size(); i++) {
			((Triangle) (tList.get(i))).draw();
		}

	}

}
