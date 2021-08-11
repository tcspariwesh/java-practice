package com.tcs.practice;

class P {
	static void printS1() {
		System.out.print("P.printS1 ");
	}

	void printS2() {
		System.out.print("P.printS2 ");
	}

	void printS1S2() {
		printS1();
		printS2();
	}
}