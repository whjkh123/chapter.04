package com.javaex.ex02;

import java.util.Arrays;

public class ObjList {

	private Object[] oArr;
	private int crtPos;

	public ObjList() {
		oArr = new Object[3];
		crtPos = 0;
	}

	public ObjList(Object[] oArr, int crtPos) {
		this.oArr = oArr;
		this.crtPos = crtPos;
	}

	public void add(Object o) {
		oArr[crtPos] = o;
		crtPos++;
	}

	public Object get(int index) {
		return oArr[index];
	}

	public int size() {
		return crtPos;
	}

	@Override
	public String toString() {
		return "ObjList [oArr=" + Arrays.toString(oArr) + ", crtPos=" + crtPos + "]";
	}

}
