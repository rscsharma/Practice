package com.test.algorithms;

public class SelectionSort {
	
	public int[] findmin(int[] input, int startindex)
	{
		if (startindex >= input.length)
		{
			return input;
		}
		int currentIndex = startindex;
		for(int i=startindex+1; i<input.length; i++)
		{		
			if (input[currentIndex] > input[i])
			{
				currentIndex = i;
			}
			
		}
		int min = input[currentIndex];
		int changed = input[startindex];
		input[startindex] = min;
		input[currentIndex] = changed;
		return findmin(input, startindex + 1);
		
	}

}
