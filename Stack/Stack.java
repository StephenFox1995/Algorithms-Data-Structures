import java.util.*;

class Stack<T> {
	
	class Node {
		T data;
		Node next;
	}
	
	private Node top;
	
	
	
	public Stack() {
		this.top = null;
	}
	
	
	// @param x : Integer value to push onto the stack.
	public void push(T x) {
		Node t = new Node();
		t.data = x;
		t.next = top;
		top = t;
	}
	
	
	// @return int: Returns the top-most element in the stack.
	public T pop() throws EmptyStackException {
		if (top != null) {
			
			T x = top.data;
			top = top.next;
			return x;
		
		} else {
			throw new EmptyStackException();	
		}
	}
	
	
	
	public boolean isEmpty() {
		return top == null;	
	}
	
	
	
	// @param x : The value in the stack to search for.
	public boolean isMember(T x) {
		Node t = top;
		
		while (t != null) {
			if(t.data == x) {
				return true;
			} else {
				t.next = t;
			}
		}
		
		return false;
	}
	
	
	
	
	public void display() {
		Node t = top;
		
		System.out.println("Stack Contents:");
		
		while (t != null) {
			System.out.println(t.data + " ");
			t = t.next;
		}
	}
	
	
	
	
	// @return peek: Returns the element at the top of the stack.
	public T peek() throws EmptyStackException {
		if(top != null) {
			return top.data;
		} else {
			throw new EmptyStackException();
		}
	}
	
	
	
	
	// @return int: The current size of the stack.
	public int size() {
		
		Node t = top;
		int counter = 0;
		
		while (t != null) {
			counter ++;
			t = t.next;
		}
		
		return counter;
	}
	
	
}