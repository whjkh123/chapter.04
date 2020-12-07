package com.javaex.ex01;

import java.util.Arrays;

public class CircleList {

	private Circle[] cArr;
	private int crtPos;

	public CircleList() {
		cArr = new Circle[3];
		crtPos = 0;

	}

	public CircleList(Circle[] cArr, int crtPos) {
		this.cArr = cArr;
		this.crtPos = crtPos;
	}

	public Circle[] getcArr() {
		return cArr;
	}

	public void setcArr(Circle[] cArr) {
		this.cArr = cArr;
	}

	public int getCrtPos() {
		return crtPos;
	}

	public void setCrtPos(int crtPos) {
		this.crtPos = crtPos;
	}

	public void add(Circle c) {
		cArr[crtPos] = c;
		crtPos++;
	}

	public Circle get(int index) {
		return cArr[index];
	}

	public int size() {
		return crtPos;
	}

	@Override
	public String toString() {
		return "CircleList [cArr=" + Arrays.toString(cArr) + ", crtPos=" + crtPos + "]";
	}

}
