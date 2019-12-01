package org.sunbeam.kdac;

import java.util.LinkedList;
import java.util.Queue;

public class Program {

	public static void main(String[] args) {
		
		Queue<Integer> q1 = new LinkedList<>();
		q1.offer(10);
		q1.offer(20);
		q1.offer(30);
		q1.add(40);
		
		while(!q1.isEmpty())
		{
			System.out.println(q1.poll());
		}
		
//		System.out.println(q1.poll());
//		System.out.println(q1.peek());
//		System.out.println(q1.poll());
//		System.out.println(q1.peek());
		
		
		};
	public static void main1(String[] args) {
		
		Queue<Integer> q1 = new LinkedList<>();
		q1.add(10);
		q1.add(20);
		q1.add(30);
		q1.add(40);
		System.out.println(q1.poll());
		System.out.println(q1.peek());
		System.out.println(q1.poll());
		System.out.println(q1.peek());
		
		
		};
		
		
	}
	

