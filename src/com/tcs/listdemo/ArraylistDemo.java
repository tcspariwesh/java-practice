package com.tcs.listdemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArraylistDemo {
	public static void main(String[] args) {
		List<Integer> numbers = createList();
//		sortList(numbers);
		filterList(numbers);
	}

	/**
	 * Method to filter the elements
	 * 
	 * @param numbers
	 */
	private static void filterList(List<Integer> numbers) {
		numbers.forEach((number) -> {
			System.out.println(number % 2 == 0);
//			break;
		});
		List<Integer> filtered = numbers.stream()
				.filter((number) -> number % 2 == 0) //lambda
				.collect(Collectors.toList());
		System.out.println(filtered);
	}

	private static void sortList(List<Integer> numbers) {
		System.out.println(numbers);
		numbers.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		System.out.println("after sorting=" + numbers);
	}

	private static List<Integer> createList() {
		List<Integer> numbers = new ArrayList<Integer>();// Generics
		numbers.add(1);// autoboxing
//		number.add("Ram");//string is not allowed
//		System.out.println(numbers.get(0));

		for (int count = 0; count < 20; count++) {
			numbers.add(count);
		}
		return numbers;
	}
}
