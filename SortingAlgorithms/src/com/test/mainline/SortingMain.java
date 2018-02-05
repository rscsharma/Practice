package com.test.mainline;

import com.test.algorithms.SelectionSort;

public class SortingMain {

	public static void main(String[] args)
	{
		
		int[] inputs = new int[] {5,2,9,13,8,3,9};
		SelectionSort selectionSort = new SelectionSort();
		inputs = selectionSort.findmin(inputs, 0);
		for(int input : inputs)
		System.out.println(input);
	}

}
