package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {

		Set<Point> pSet = new HashSet<Point>();

		Point p01 = new Point(1, 1);
		Point p02 = new Point(2, 2);
		Point p03 = new Point(3, 3);
		Point p04 = new Point(1, 1);

		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		pSet.add(p04);

		System.out.println(pSet.toString());

		System.out.println("=========================================");

		Set<Point2> pSet2 = new HashSet<Point2>();

		Point2 p11 = new Point2(1, 1);
		Point2 p12 = new Point2(2, 2);
		Point2 p13 = new Point2(3, 3);
		Point2 p14 = new Point2(1, 1);

		pSet2.add(p11);
		pSet2.add(p12);
		pSet2.add(p13);
		pSet2.add(p14);

		System.out.println(pSet2.toString());

		System.out.println("=========================================");

		Set<Point3> pSet3 = new HashSet<Point3>();

		Point3 p21 = new Point3(1, 1);
		Point3 p22 = new Point3(2, 2);
		Point3 p23 = new Point3(3, 3);
		Point3 p24 = new Point3(4, 1);

		pSet3.add(p21);
		pSet3.add(p22);
		pSet3.add(p23);
		pSet3.add(p24);

		System.out.println(pSet3.toString());

	}

}
