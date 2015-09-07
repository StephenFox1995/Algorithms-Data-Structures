class HeapMain {
	public static void main(String[] args) {
		
		Heap heap = new Heap(20);
		
		heap.insert(1);
		
		heap.insert(38);
		heap.insert(35);
		heap.insert(34);
		heap.insert(40);
		heap.insert(30);
		heap.insert(25);
		heap.insert(10);
		heap.insert(3);
		heap.insert(20);
				
		heap.display();
		
		
		heap.remove();
		
		System.out.println();
		heap.display();


	}
}