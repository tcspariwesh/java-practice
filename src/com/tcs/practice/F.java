package com.tcs.practice;

class E {
	void printS1() {
		System.out.print("E.printS1 ");
	}

	static void printS2() {
		System.out.print("E.printS2");
	}
}

public class F extends E {
	void printS1() {
		System.out.print("F.printS1 ");
	}

	static void printS2() {
		System.out.print("F.printS2");
	}

	public static void main(String args[]) {
		E x = new F();
		x.printS1();
		x.printS2();
	}
}