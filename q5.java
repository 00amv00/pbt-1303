import java.util.*;

class node_{
	
	int val;
	node_ next;
	
	public node_(int val) {
		this.val = val;
	}
}

class linkedlist_{
	
	node_ head;
	
	void insert(int val) {
		
		node_ n = new node_(val);
		
		if(head == null) {
			head = n;
			return;
		}
		
		node_ temp = head;
		
		while(temp.next != null)
			temp = temp.next;
		temp.next = n;
	}

	void display() {
		
		if(head == null) {
			System.out.println("Empty");
			return;
		}
		
		node_ temp = head;
		
		while(temp.next != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println(temp.val);
	}
	
	void find_middle() {
		
		if(head == null) {
			System.out.println("Empty");
			return;
		}
		
		int a = 1;
		int b = 1;
		node_ mid = head;
		node_ end = head;
		
		while(end.next != null) {
			if(b / 2 > a) {
				mid = mid.next;
				a++;
			}
			end = end.next;
			b++;
		}
		
		if(b == 1 || b == 2) {
			System.out.println(mid.val);
			return;
		}
		System.out.println(mid.next.val);
	}
}

public class q5{
	public static void main(String[] args) {
		
		linkedlist_ l1 = new linkedlist_();
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for(int i = 0; i < n; i++) {
			l1.insert(s.nextInt());
		}
		
		l1.display();
		l1.find_middle();
		
		s.close();
	}
}