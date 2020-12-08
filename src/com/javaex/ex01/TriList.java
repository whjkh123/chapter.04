package com.javaex.ex01;

import java.util.Arrays;

public class TriList {

	private Triangle[] tArr;
	private int crtPos;

	public TriList() {
		tArr = new Triangle[3];
		crtPos = 0;
	}

	public TriList(Triangle[] tArr, int crtPos) {
		this.tArr = tArr;
		this.crtPos = crtPos;
	}

	public void add(Triangle t) {
		tArr[crtPos] = t;
		crtPos++;
	}

	public Triangle get(int index) {
		return tArr[index];
	}

	public int size() {
		return crtPos;
	}

	@Override
	public String toString() {
		return "TriList [tArr=" + Arrays.toString(tArr) + ", crtPos=" + crtPos + "]";
	}

}
