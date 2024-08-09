package com.springcore.ref;

public class A {
	private int num;
	private B obj;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public B getObj() {
		return obj;
	}
	public void setObj(B obj) {
		this.obj = obj;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "A [num=" + num + ", obj=" + obj + "]";
	}

}
