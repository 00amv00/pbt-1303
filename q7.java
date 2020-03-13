import java.util.*;

class stack_{
	
	Stack<Integer> s = new Stack<>();
	Stack<Integer> max = new Stack<>();
	
	void push(int n) {
		
		if(s.isEmpty()) {
			s.push(n);
			max.push(n);
			System.out.println("Pushed " + n);
			return;
		}
		
		if(n >= max.peek()) {
			s.push(n);
			max.push(n);
			System.out.println("Pushed " + n);
			return;
		}
		
		s.push(n);
		System.out.println("Pushed " + n);
	}
	
	void pop() {
		
		if(s.isEmpty()) {
			System.out.println("The stack is empty");
			return;
		}
		
		if(s.peek() == max.peek()) {
			s.pop();
			System.out.println("Popped " + max.pop());
			return;
		}
		
		System.out.println("Popped " + s.pop());
	}
	
	void get_max() {
		
		if(s.isEmpty()) {
			System.out.println("The stack is empty");
			return;
		}
		
		System.out.println("Maximum element is " + max.peek());
	}
}

public class q7{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		stack_ stack = new stack_();
		
		stack.get_max();
		
		stack.push(0);
		stack.push(-99);
		stack.push(45);
		stack.push(50);
		stack.push(50);
		
		stack.get_max();
		
		stack.pop();
		
		stack.get_max();
		
		stack.pop();
		stack.pop();
		
		stack.get_max();
		
		s.close();
	}
}