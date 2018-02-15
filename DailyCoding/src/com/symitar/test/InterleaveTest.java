package com.symitar.test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*Given a stack of N elements, interleave the first half of the stack with the second half reversed using only one other queue. This should be done in-place.

Recall that you can only push or pop from a stack, and enqueue or dequeue from a queue.

For example, if the stack is [1, 2, 3, 4, 5], it should become [1, 5, 2, 4, 3]. If the stack is [1, 2, 3, 4], it should become [1, 4, 2, 3].
*/
public class InterleaveTest 
{

	public static void test()
	{
		Queue<Integer> queue = new LinkedList<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(11);
		stack.push(12);
		stack.push(13);
		stack.push(14);
		stack.push(15);
		stack.push(16);
		stack.push(17);
		stack.push(18);
		stack.push(19);
		stack.push(20);
		
		System.out.println("Input = " + stack);
		interleave(1, stack, queue);
		System.out.println("Output = " + stack);
	}
	
	
	private static void interleave(int minCount, Stack<Integer> stack, Queue<Integer> queue)
	{
		if (minCount == stack.size())
		{
			return;
		}
		
		while(stack.size() > minCount)
		{
			queue.add(stack.pop());
		}
		
		while(queue.size() > 0)
		{
			stack.push(queue.remove());
		}
		
		interleave(++minCount, stack, queue);
	}

}
