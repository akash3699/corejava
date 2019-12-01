package org.sunbeam.kdac;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Program {

	public static void main(String[] args) {
		
		
//		Stack<Integer> stk = new Stack<>();
		Deque<Integer> stk = new ArrayDeque<>();
		stk.add(100);
		stk.add(200);
		stk.add(300);
		stk.add(400);
		
		
//		System.out.println(stk.isEmpty());
		while(!stk.isEmpty())
		{
			System.out.println(stk.peek());
			stk.pop();
			
		}

	}
	public static void main1(String[] args) {
		
		
		Stack<Integer> stk = new Stack<>();
		stk.add(100);
		stk.add(200);
		stk.add(300);
		stk.add(400);
		
		
//		System.out.println(stk.isEmpty());
		while(!stk.isEmpty())
		{
			System.out.println(stk.peek());
			stk.pop();
			
		}

	}

}
