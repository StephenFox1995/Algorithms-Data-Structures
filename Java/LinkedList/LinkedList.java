class LinkedList {
	
	
	public Node head;
	

	// Insert a new node into a SORTED LIST
	public void insertSorted(int data) {

		// node is the new element
		Node node = new Node();
		node.data = data;
		// tempNode traverses through the linked list
		Node tempNode = this.head;

		while (tempNode != null) {
			// If data of the node after tempNode is greater than the 
			// inserted data, point the new node to that node, and point
			// temp node to the new node.
			if (node.data < tempNode.next.data) {
				node.next = tempNode.next;
				tempNode.next = node;
			}

			// Traverse to the next node on the list
			tempNode = tempNode.next;
		}		
	}
	
	
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