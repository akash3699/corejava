package org.sunbeam.kdac;



public class Linklist {
	node head;
	public Linklist() {
		// TODO Auto-generated constructor stub
	}
	public Linklist(node head) {
		this.head = head;
	}

	public node getHead() {
		return head;
	}

	public void setHead(node head) {
		this.head = head;
	}

	@Override
	public String toString() {
		return "Linkedlist [head=" + head + "]";
	}
	public void addFirst(int i) {
		if(this.head==null)
			this.head=new node(i);
		else
		{
			node temp = this.head;
			this.head=new node(i);
			this.head.next=temp;
			
		}
		
		
	}
	public void deleteFirst() {
		if(this.head==null)
			System.out.println("NO elements in linked list");
		else
		{
			
			this.head=this.head.next;
			
		}
		
		
	}
	public void addLast(int i) {
		if(this.head==null)
			this.head=new node(i);
		else
		{
			node trav=this.head;
			while(trav.next!=null)
			{
				trav=trav.next;
			}
			
			trav.next=new node(i);
			
		}
		
		
		
	}
	public void deleteLast() {
		node trav=this.head;
		while(trav.next.next!=null)
		{
			
			trav=trav.next;
		}
		trav.next=null;
	}
	public void print() {
		System.out.println();
		node trav=this.head;
		while(trav!=null)
		{
			System.out.print(trav.data+"->");
			trav=trav.next;
		}
		System.out.println();
		
	}
	

}