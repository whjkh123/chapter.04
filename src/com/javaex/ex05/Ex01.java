package com.javaex.ex05;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {

		Set<Integer> iSet = new HashSet<Integer>();

		iSet.add(3);// Integer i01 = new Integer(3); > Integer i01 = 3; (Boxing)
		iSet.add(5);// Integer i02 = new Integer(5); > Integer i02 = 5; (Boxing)
		iSet.add(8);// Integer i03 = new Integer(5); > Integer i03 = 8; (Boxing)

		System.out.println(iSet.toString());

		System.out.println("=========================================");

		System.out.println(iSet.size());

		System.out.println("=========================================");

		for (Integer i : iSet) {// 향상된 for문 > (int i : iSet) (Unboxing)
			System.out.println(i.toString());// System.out.println(i);
		}

		System.out.println("=========================================");

		iSet.remove(3);

		for (Integer i : iSet) {// 향상된 for문 > (int i : iSet) (Unboxing)
			System.out.println(i.toString());// System.out.println(i);
		}

		System.out.println("=========================================");

		iSet.add(5);
		iSet.add(8);

		for (Integer i : iSet) {// 향상된 for문 > (int i : iSet) (Unboxing)
			System.out.println(i.toString());// System.out.println(i);
		}
		// 중복 데이터 추가 불가

	}

}
