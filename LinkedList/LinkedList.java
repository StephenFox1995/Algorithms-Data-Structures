class LinkedList {
	
	
	public Node head;
	
	
	
	// Creates a new node for the linked list.
	public void insertAtHead(int data) {
		
		Node newNode = new Node(data);
		newNode.setNextNode(this.head);
		
		// The head of the linked list
		// is now the 'newNode' object we have just created.
        this.head = newNode;
	}
	
	
	
	
	// Deletes the Node object at the head of the linked list.
	public void deleteFromHead() {
		this.head = this.head.getNextNode();
	}
	
	
	
	// @param data: The data to look for in the linked list.
	// @return Node: Returns the correspondng Node, that contains
	// that data.
	public Node find (int data) {
		Node current = this.head;
		
		while (current != null) {
			if (current.getData() == data) {
				return current;
			}
			current = current.getNextNode();
		}
		return null;
	}
	
	
	
	
	// @return int: Returns the length of the linked list i.e
	// the amount of Node objets in the list.
	public int length() {
		int length = 0;
		
		Node current = this.head;
		
		while (current != null) {
			length++;
			current = current.getNextNode();
		}
		return length;
	}
	
	
	
	// @return String: Returns a String representation of the
	// linked list.
	@Override 
	public String toString() {
		String result = "{";
		Node current = this.head;
		
		while(current != null) {
			result += current.toString() + ", ";
			current = current.getNextNode();
			
		}
		result += " }";
		
		return result;
	}
}