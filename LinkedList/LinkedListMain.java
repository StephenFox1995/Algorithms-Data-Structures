class LinkedListMain {
	public static void main(String[] args) {
		
		LinkedList linkedList = new LinkedList();
		
		linkedList.insertAtHead(10);
		linkedList.insertAtHead(69);
		linkedList.insertAtHead(20);
		
		System.out.println(linkedList.toString());
		
		
		linkedList.deleteFromHead();
		
		System.out.println(linkedList.find(10).toString());
		
		System.out.println("\nLinked List size: " + linkedList.length());
	}
}