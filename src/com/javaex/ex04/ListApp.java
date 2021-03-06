package com.javaex.ex04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {

	public static void main(String[] args) {

		// ArrayList
		// ArrayList<Rectangle> rList = new ArrayList<Rectangle>();
		List<Rectangle> rList = new ArrayList<Rectangle>();

		System.out.println("================Rectangle================");

		Rectangle r01 = new Rectangle(3, 3);
		Rectangle r02 = new Rectangle(5, 5);

		rList.add(r01);
		rList.add(r02);

		Rectangle r = rList.get(0);
		System.out.println(r.getWidth());
		System.out.println(r.getHeight());
		r.draw();
		System.out.println(r.toString());

		System.out.println("=========================================");

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

		System.out.println(rList.toString());

		System.out.println("==================Cirlce=================");

		// ArrayList<Circle> cList = new ArrayList<Circle>();
		List<Circle> cList = new ArrayList<Circle>();

		Circle c01 = new Circle(5);
		Circle c02 = new Circle(7);

		cList.add(c01);
		cList.add(c02);
		// cList.add(r01); > 이 상황을 방지하기 위한 제네릭

		for (int i = 0; i < cList.size(); i++) {
			cList.get(i).draw();
		}

		System.out.println("=========================================");

		Circle c03 = new Circle(9);
		cList.add(0, c03);// cList.add(index index, element); > [0]번 자리에 c03 데이터 추가

		for (int i = 0; i < cList.size(); i++) {
			cList.get(i).draw();
		}

		System.out.println("=========================================");

		cList.remove(2);// cList.remove(int index); > [1]번 자리 데이터 삭제

		for (int i = 0; i < cList.size(); i++) {
			cList.get(i).draw();
		}

		System.out.println("=========================================");

		cList.remove(c01);// cList.remove(Object o); > [c01] 데이터 삭제

		for (int i = 0; i < cList.size(); i++) {
			cList.get(i).draw();
		}

		System.out.println(cList.toString());

		System.out.println("================Triangle=================");
		// LinkedList
		// LinkedList<Triangle> tList = new LinkedList<Triangle>();
		List<Triangle> tList = new LinkedList<Triangle>();

		Triangle t01 = new Triangle(2, 2);
		Triangle t02 = new Triangle(4, 4);

		tList.add(t01);
		tList.add(t02);
		// tList.add(c01); > 이 상황을 방지하기 위한 제네릭

		for (int i = 0; i < tList.size(); i++) {
			tList.get(i).draw();
		}

		System.out.println("=========================================");

		Triangle t03 = new Triangle(6, 6);

		tList.add(t03);

		for (int i = 0; i < tList.size(); i++) {
			tList.get(i).draw();
		}

		System.out.println("=========================================");

		tList.add(3, t03);

		for (int i = 0; i < tList.size(); i++) {
			tList.get(i).draw();
		}

		System.out.println("=========================================");

		tList.remove(0);

		for (int i = 0; i < tList.size(); i++) {
			tList.get(i).draw();
		}

		System.out.println("=========================================");

		tList.remove(t03);// 첫번째 데이터만 삭제(Removes the first occurrence of the specified element from this
							// list)

		for (int i = 0; i < tList.size(); i++) {
			tList.get(i).draw();
		}

		System.out.println(tList.toString());

	}

}
