class Node {
	
	private int data;
	private Node nextNode;
	
	
	// Constructs a node and initialises the 
	// data field.
	public Node(int data) {
		this.data = data;
	}
	
	
	// Accessors for the data variable.
	// @return int: Returns the data contained within this Node object.
	public int getData() {
		return this.data;
	}
	
	
	// @param data: The data to store within this node.
	public void setData(int data) {
		this.data = data;
	}
	
	
	
	// @return Node: Returns the next node i.e the node this Nodes 'nextNode' field 'points' to.
	public Node getNextNode() {
		return this.nextNode;
	}
	
	
	
	// @param nextNode: Sets the node this node's 'nextNode' field
	// 'points' to.
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Data: " + this.data;
	}
}