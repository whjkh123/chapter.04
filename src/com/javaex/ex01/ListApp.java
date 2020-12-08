package com.javaex.ex01;

public class ListApp {

	public static void main(String[] args) {
		// 사각형 - 사각형. 원 - 원. 삼각형 - 삼각형

		RectList rList = new RectList();

		Rectangle r01 = new Rectangle(2, 5);
		Rectangle r02 = new Rectangle(12, 15);

		rList.add(r01);
		rList.add(r02);

		Rectangle r100 = rList.get(0);
		r100.draw();

		for (int i = 0; i < rList.size(); i++) {
			/*
			 * Rectangle r = rList.get(i); r.draw();
			 */
			rList.get(i).draw();
		}

		System.out.println(rList.size());

		System.out.println("=========================================");

		CircleList cList = new CircleList();

		Circle c01 = new Circle(2);
		Circle c02 = new Circle(12);

		cList.add(c01);
		cList.add(c02);

		Circle c100 = cList.get(0);
		c100.draw();

		for (int i = 0; i < cList.size(); i++) {
			/*
			 * Circle c = cList.get(i); c.draw();
			 */
			cList.get(i).draw();
		}

		System.out.println(cList.size());

		System.out.println("=========================================");

		TriList tList = new TriList();

		Triangle t01 = new Triangle(19, 92);
		Triangle t02 = new Triangle(11, 3);

		tList.add(t01);
		tList.add(t02);

		Triangle t100 = tList.get(0);
		t100.draw();

		for (int i = 0; i < tList.size(); i++) {
			/*
			 * Triangle t = tList.get(i); t.draw();
			 */
			tList.get(i).draw();
		}

		System.out.println(tList.size());

	}

}
