import java.util.*;

class queue{
	
	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();
	
	void enqueue(int val) {
		s1.push(val);
		System.out.println("Enqueued " + val);
	}
	
	void dequeue() {
		
		if(s2.isEmpty()) {
			if(s1.isEmpty()) {
				System.out.println("Queue is empty");
				return;
			}
			
			while(!s1.isEmpty())
				s2.push(s1.pop());
			System.out.println("Dequeued " + s2.pop());
		}
		else
			System.out.println("Dequeued " + s2.pop());
	}
	
	void display()
	{
		while(!s2.isEmpty())
			s1.push(s2.pop());
		System.out.println(s1);
	}
}

public class q8{
	public static void main(String[] args) {
		
		queue q = new queue();
		
		q.dequeue();
		q.display();
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		
		q.display();
		
		q.dequeue();
		q.dequeue();
		q.dequeue();
		
		q.display();
		
		q.enqueue(1);
		
		q.display();
		
	}
}