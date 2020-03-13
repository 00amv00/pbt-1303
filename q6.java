import java.util.*;

class node{
	
	int val;
	node next;
	
	public node(int val) {
		this.val = val;
	}
}

class linkedlist{
	
	node head;
	
	void insert(int val) {
		
		node n = new node(val);
		
		if(head == null) {
			head = n;
			return;
		}
		
		node temp = head;
		
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = n;
	}
	
	void display() {
		
		if(head == null) {
			System.out.println("Empty");
			return;
		}
		
		node temp = head;
		
		while(temp.next != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		
		System.out.println(temp.val);
	}
	
	node reverse(node n) {
		
		node previous = null;
		node current = n;
		node next = null;
		
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		
		return previous;
	}
}

public class q6{
	public static void main(String[] args) {
		
		linkedlist l1 = new linkedlist();
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for(int i = 0; i < n; i++) {
			l1.insert(s.nextInt());
		}
		
		l1.display();
		l1.head = l1.reverse(l1.head);
		l1.display();
		
		s.close();
	}
}