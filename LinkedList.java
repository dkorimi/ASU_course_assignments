
public class LinkedList {
	
	static Node head;
	
	static class Node {
		
		int data;
		Node next;
		
		Node (int d){ data = d; next = null; }
		
	}
	
	public static void main(String[] args){
		LinkedList link = new LinkedList();
	
		link.head = new Node(1);
		Node s = new Node(2);
		Node t = new Node(3);
		
		link.head.next = s;
		s.next = t;
		Node n = head;
		while (n!= null)
		{
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(link.head.data);
		System.out.println(s.data);
		System.out.println(t.data);
	
	}

}
