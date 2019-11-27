package org.sunbeam.kdac;

public class Stack {
	public int arr[];
	public int top=-1;
	public Stack() {
		this(5);
	}
	
	public Stack(int size) {
		this.arr = new int[size];
		
	}
	
	public int[] getArr() {
		return arr;
	}
	public void setArr(int[] arr) {
		this.arr = arr;
	}
	public int getTop() {
		return top;
	}
	public void setTop(int top) {
		this.top = top;
	}
	
	public boolean isEmpty()
	{
		return (top==-1);
	}
	
	public boolean isFull()
	{
		return (top==9);
	}
	
	public void push(int data) throws StackOverFlowException
	{
		if(isFull())
			throw new StackOverFlowException("Stack is Full");
		else
		this.arr[++top]=data;
		
	}
	
	public int peek() throws StackUnderFlowException
	{
		if(isEmpty())
			throw new StackUnderFlowException("Stack is Empty");
		else
			return this.arr[top];
	}
	
	public void pop() throws StackUnderFlowException
	{
		if(isEmpty())
			throw new StackUnderFlowException("Stack is Empty");
		else
			--top;
	}

}
