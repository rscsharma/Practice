package com.test.algorithms;

import java.util.Arrays;

public class MergeSort {

	public void sort(int[] input)
	{
		int half = input.length / 2;

		int[] arr1 = Arrays.copyOfRange(input, 0, half); 
		int[] arr2 = Arrays.copyOfRange(input, half, input.length); 		
	
		if (arr1.length > 1)
		{
			sort(arr1);
		}
		if (arr2.length > 1)
		{
			sort(arr2);
		}
		int i =0;
		int j = 0;
		int k=0;
		while(i < arr1.length && j < arr2.length)
		{
			if (arr1[i] < arr2[j])
			{
				input[k] = arr1[i];
				i++;
				k++;
			}
			else
			{
				input[k] = arr2[j];
				j++;
				k++;
				
			}
		}
		while(i < arr1.length)
		{
			input[k] = arr1[i];
			i++;
			k++;
		}
		while(j < arr2.length)
		{
			input[k] = arr2[j];
			j++;
			k++;
		}

	}




}
