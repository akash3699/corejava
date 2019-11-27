package org.sunbeam.kdac;

public class node {
	int data;
	node next;
	public node() {
		// TODO Auto-generated constructor stub
		this.data=0;
		this.next=new node();
	}
	public node(int data) 
	{
		this.data = data;
		this.next = null;
	}
	public node(int data, node next) {
		
		this.data = data;
		this.next = next;
	}

	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public node getNext() {
		return next;
	}
	public void setNext(node next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		return  data +"->"+ next;
	}
	

}