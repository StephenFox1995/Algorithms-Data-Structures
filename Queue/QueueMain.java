class QueueMain {
	public static void main(String[] args) {
		
		Queue<Integer> queue = new Queue<Integer>();
		
		queue.enQueue(10);
		queue.enQueue(18);
		
		queue.display();
		queue.deQueue();
		
		queue.display();
		
		
		if(queue.isEmpty()) {
			System.out.println("Empty");
		} else {
			System.out.println("Not empty");
		}
	}
}