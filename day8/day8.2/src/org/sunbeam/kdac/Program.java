package org.sunbeam.kdac;

import java.util.Iterator;

class Node
{
	int data;
	Node next;
	public Node( int data )
	{
		this.data = data;
	}
}
class LinkedList implements Iterable<Integer>
{
	private Node head;
	private Node tail;
	public boolean empty( )
	{
		return this.head == null;
	}
	public void addLast( int data )
	{
		Node node = new Node( data );
		if( this.empty() )
			this.head = node;
		else
			this.tail.next = node;
		this.tail = node;
	}
	@Override
	public Iterator<Integer> iterator() 
	{
		Iterator<Integer> itr = new LinkedListIterator( this.head );
		return itr;
	}
}
class LinkedListIterator implements Iterator<Integer>
{
	private Node node;
	public LinkedListIterator(Node node) 
	{
		this.node = node;
	}
	@Override
	public boolean hasNext() 
	{
		if( this.node != null )
			return true;
		return false;
	}
	@Override
	public Integer next() 
	{
		Integer data = this.node.data;
		this.node = node.next;
		return data;
	}
}
public class Program 
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.addLast( 10 );
		list.addLast( 20 );
		list.addLast( 30 );
		
		for( int element : list )
			System.out.println(element);
		
		/*Integer element = null;
		Iterator<Integer> itr = list.iterator();
		while( itr.hasNext())
		{
			element = itr.next();
			System.out.println(element);
		}*/
	}
}