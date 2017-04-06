
public class LinkedListLength {

	Node head;
	
	static class Node {
		int data;
		Node next;
		
		Node(int d){data = d; next = null;}
	}
	
	public int Length()
	{
		Node n = head;
		int val = 0;
		
		if( n == null)
			return 0;
		
		while(n != null){
			n = n.next;
			val ++;
		}
		
		return val;
	}
	
	public static void main(String[] args){
		LinkedListLength link = new LinkedListLength();
		int ans;
		link.head = new Node(1);
		Node s = new Node(2);
		Node t = new Node(3);
		
		link.head.next = s;
		s.next = t;
		
		ans = link.Length();
		
		System.out.println(ans);
		
	}
}
