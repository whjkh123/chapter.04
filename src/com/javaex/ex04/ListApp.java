package com.javaex.ex04;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListApp {

	public static void main(String[] args) {

		// ArrayList
		ArrayList<Rectangle> rList = new ArrayList<Rectangle>();

		Rectangle r01 = new Rectangle(3, 3);
		Rectangle r02 = new Rectangle(5, 5);

		rList.add(r01);
		rList.add(r02);

		Rectangle r = rList.get(0);
		System.out.println(r.getWidth());
		System.out.println(r.getHeight());
		r.draw();
		System.out.println(r.toString());

		System.out.println("================Rectangle================");

		Rectangle r03 = new Rectangle(7, 7);

		rList.add(1, r03);// rList.add(int index, element); > [1]번 자리에 r03 데이터 추가

		for (int i = 0; i < rList.size(); i++) {
			rList.get(i).draw();
		}

		System.out.println("=========================================");

		rList.remove(1);// rList.remove(int index); > [1]번 자리 데이터 삭제

		for (int i = 0; i < rList.size(); i++) {
			rList.get(i).draw();
		}

		System.out.println("=========================================");

		rList.remove(r02);// rList.remove(Object o); > [r02] 데이터 삭제

		for (int i = 0; i < rList.size(); i++) {
			rList.get(i).draw();
		}

		System.out.println("==================Cirlce=================");

		ArrayList<Circle> cList = new ArrayList<Circle>();

		Circle c01 = new Circle(5);
		Circle c02 = new Circle(7);

		cList.add(c01);
		cList.add(c02);
		// cList.add(r01); > 이 상황을 방지하기 위한 제네릭

		for (int i = 0; i < cList.size(); i++) {
			cList.get(i).draw();
		}

		System.out.println("================Triangle=================");
		// LinkedList
		LinkedList<Triangle> tList = new LinkedList<Triangle>();

		Triangle t01 = new Triangle(2, 2);
		Triangle t02 = new Triangle(4, 4);

		tList.add(t01);
		tList.add(t02);
		// tList.add(c01); > 이 상황을 방지하기 위한 제네릭

		for (int i = 0; i < tList.size(); i++) {
			tList.get(i).draw();
		}

	}

}
