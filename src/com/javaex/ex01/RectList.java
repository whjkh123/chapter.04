package com.javaex.ex01;

public class RectList {

	private Rectangle[] rArr;
	private int crtPos;

	public RectList() {
		rArr = new Rectangle[3];
		crtPos = 0;
	}

	public RectList(Rectangle[] rArr, int crtPos) {
		this.rArr = rArr;
		this.crtPos = crtPos;
	}

	public Rectangle[] getrArr() {
		return rArr;
	}

	public void setrArr(Rectangle[] rArr) {
		this.rArr = rArr;
	}

	public int getCrtPos() {
		return crtPos;
	}

	public void setCrtPos(int crtPos) {
		this.crtPos = crtPos;
	}

	public void add(Rectangle r) {
		rArr[crtPos] = r;
		crtPos++;
	}

	public Rectangle get(int index) {
		return rArr[index];
	}

	public int size() {
		return crtPos;
	}

}
