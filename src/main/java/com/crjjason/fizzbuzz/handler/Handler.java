package com.crjjason.fizzbuzz.handler;

public abstract class Handler {
	protected Handler next;

	public Handler getNext() {
		return next;
	}

	public void setNext(Handler next) {
		this.next = next;
	}
	
	public abstract String handleRequest(int number);
}
