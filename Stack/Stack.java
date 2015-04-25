import java.util.*;

class Stack {
	
	class Node {
		int data;
		Node next;
	}
	
	private Node top;
	
	
	public Stack() {
		this.top = null;
	}
	
	
	// @param x : Integer value to push onto the stack.
	public void push(int x) {
		Node t = new Node();
		t.data = x;
		t.next = top;
		top = t;
	}
	
	
	// @return int: Returns the top-most element in the stack.
	public int pop() throws EmptyStackException {
		int x = top.data;
		top = top.next;
		return x;
	}
	
	
	
	public boolean isEmpty() {
		return top == null;	
	}
	
	
	
	// @param x : The value in the stack to search for.
	public boolean isMember(int x) {
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
	
	
	// @return peek
	public int peek() {
		if(top != null) {
			return top.data;
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