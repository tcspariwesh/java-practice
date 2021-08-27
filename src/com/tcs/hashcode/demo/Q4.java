package com.tcs.hashcode.demo;

public class Q4 {
	public static void main(String[] args) {

	}
}

class A {
	static void m1(B a, B b, B c, B d, B e, B f, B g, B h) {
		if (a.equals(b)) {
			System.out.print("A");
		}
		if (!c.equals(d)) {
			System.out.print("B");
		}
		if (e.hashCode() == f.hashCode()) {
			System.out.print("C");
		}
		if (g.hashCode() != h.hashCode()) {
			System.out.print("D");
		}
	}
}