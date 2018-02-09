package com.test.algorithms;

public class BubbleSort {
	public void sort(int[] input) {
		while (true) {
			boolean itemsSwapped = false;
			for (int i = 0; i < input.length - 1; i++) {
				if (input[i] > input[i + 1]) {
					itemsSwapped = true;
					int temp = input[i];
					input[i] = input[i + 1];
					input[i + 1] = temp;
				}
			}
			if (!itemsSwapped) {
				break;
			}
		}
	}
}
