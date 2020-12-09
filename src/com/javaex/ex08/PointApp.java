package com.javaex.ex08;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {

		Map<String, Point> pMap = new HashMap<>();

		Point p01 = new Point(1, 1);
		Point p02 = new Point(2, 2);
		Point p03 = new Point(3, 3);
		Point p04 = new Point(4, 4);

		pMap.put("박명수", p01);
		pMap.put("유재석", p02);
		pMap.put("정준하", p03);
		pMap.put("노홍철", p04);

		System.out.println(pMap.toString());
		System.out.println(pMap.get("유재석").getX());
		System.out.println(pMap.get("유재석").getY());

		Point p05 = new Point(5, 5);
		pMap.put("박명수", p05);

		System.out.println(pMap.toString());

		System.out.println("사이즈: " + pMap.size());

		Set<String> keys = pMap.keySet();// Map에서 key 데이터를 Set으로 관리

		for (String key : keys) {
			System.out.println(pMap.get(key).getX());
		}

	}

}
