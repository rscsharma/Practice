package com.test.algorithms;

public class InsertionSort 
{
	public void sort(int[] input) {
		for(int i=1; i <input.length;i++)
		{
			int temp = input[i];
			int j = i;
			while(j >0 && input[j-1] > temp)
			{
				input[j] = input[j-1];
				j--;
			}
			input[j] = temp;
			
			
		}
	}
}
