package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class MinilottoApp {

	public static void main(String[] args) {

		Set<Integer> iSet = new HashSet<Integer>();
		Set<Integer> lSet = new HashSet<Integer>();

		int lotto;

		while (iSet.size() != 6) {
			lotto = (int) (Math.random() * 45) + 1;
			iSet.add(lotto);
		}

		for (int lot : iSet) {
			System.out.print(lot + " ");
		}

		System.out.println();
		System.out.println("=========================================");

		while (lSet.size() < 6) {
			int num = (int) (Math.random() * 45) + 1;
			lSet.add(num);
		}

		for (int no : lSet) {
			System.out.print(no + " ");
		}

	}

}
