class Heap {
	
	// These variables represent the heap.
	private int[] heapArray, heapPosition;
	
	// The number of elements currenty in the heap.
	private int N;
	
	// The maximum size permitted for the heap.
	private static int heapMax = 100;
	
	
	
	public Heap(int heapMax) {
		heapArray = new int[heapMax + 1];
		heapPosition = new int[heapArray.length];
		N = 0;
	}
	
	
	public void insert(int x) {
		heapArray[++N] = x;
		
		// Sift up from this position.
		siftUp(N);
	}
	
	
	
	public void siftUp(int k) {
		int heapElement = heapArray[k];
		
		heapArray[0] = Integer.MAX_VALUE;
		
		// Child is greater than parent(k \ 2)
		while (heapElement > heapArray[k / 2]) {
			heapArray[k] = heapArray[k / 2];
			k = k / 2;
		}
		
		heapArray[k] = heapElement;
	}
	
	
	
	public void siftDown(int k) {
		
		int heapElement = heapArray[k];
		
		while (k <= N / 2) {
			
			int j = k * 2;
			
			if(j < N && heapArray[j] < heapArray[j + 1]) {
				++j;
			}
			
			if(heapElement >= heapArray[j]) {
				break;
			}
			
			heapArray[k] = heapArray[j];
			k = j;
		}
		
		heapArray[k] = heapElement;
	}
	
	
	
	
	public int remove() {
		
		int root = heapArray[1];
		
		heapArray[1] = heapArray[N--];
		
		siftDown(1);
		
		return root;
		
	}
	
	
	
	
	public void display() {
		
		System.out.println(heapArray[1]);
		
		for (int i = 1; i <= N; i++) {
			System.out.println(heapArray[i]);
		}
	}
	
}