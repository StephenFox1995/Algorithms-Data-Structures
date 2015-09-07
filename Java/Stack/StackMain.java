import java.util.*;

class StackMain {
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		// The stack should be empty as we haven't added
		// any elements to it.
		System.out.println(stack.isEmpty());
		
		// Push 10, 45 & 834 onto the stack.
		stack.push(10);
		stack.push(45);
		stack.push(834);
		
		stack.display();
		

		// Let's peek at the stack before we pop.
		stack.peek();
		
		stack.pop();
		
		System.out.println();
		stack.display();
		
	}
	
	
}