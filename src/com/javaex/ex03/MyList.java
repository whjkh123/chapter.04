package com.javaex.ex03;

import java.util.Arrays;

public class MyList<T> {// 메모리 로딩 제약 <변수명>
	private T[] lArr;
	private int crtPos;

	public MyList() {
		lArr = (T[]) (new Object[3]);
		crtPos = 0;
	}

	public void add(T l) {
		lArr[crtPos] = l;
		crtPos++;
	}

	public T get(int index) {
		return lArr[index];
	}

	public int size() {
		return crtPos;
	}

	@Override
	public String toString() {
		return "MyList [lArr=" + Arrays.toString(lArr) + ", crtPos=" + crtPos + "]";
	}
}
