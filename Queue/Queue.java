class Queue<T> {
	
	private class Node {
		T data;
		Node next;
	}
	
	Node node;
	Node head;
	Node tail;
	
	
	
	public Queue() {
		node = new Node();
		node.next = node;
		
		head = node;
		tail = null;
	}
	
	
	
	public void display() {
		System.out.println("Queue Contents:");
		
		Node tempNode = head;
		
		while (tempNode != tempNode.next) {
			System.out.println(tempNode.data);
			tempNode = tempNode.next;
		}
	}
	
	
	
	// @param x: The element to add to the queue.
	public void enQueue(T x) {
		
		Node tempNode;
		
		tempNode = new Node();
		tempNode.data = x;
		tempNode.next = node;
		
		
        if(head == node)  {// If the queue is empty.
			head = tempNode;
        }
        else {
            tail.next = tempNode; // Previous tail's next property to the new tail.(tempNode)
        }
			
		tail = tempNode; // Our new tail is the Node we just enQueue'd (tempNode)
	}
	
	
	
	
	// @return T: The element at the front(head) of the queue.
	public T deQueue() {
		T x = head.data;
		head = head.next;
		return x;
	}
	
	
	
	public boolean isEmpty() {
		return head == node;
	}
	
	
	
	
	// @param x: The member value to search for inside the queue.
	public boolean isMember(T x) {
		Node tempNode = head;
		
		while (tempNode != node) {
			if(tempNode.data == x) return true;
			
			tempNode = tempNode.next;
		}
		
		return false;
	}
	
}