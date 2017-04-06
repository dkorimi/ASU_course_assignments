public class LinkedListSwap {

	Node head;
	
	static class Node {
		
		int data;
		Node next;
		
		Node (int d){ data = d; next = null; }
		
	}
	
	public void swap(int key1, int key2){
		
		Node n = head;
		
		if(n == null){
			return;
		}
		
		while(n!= null){
			
			if(n.data != key1 || n.data != key2){
				
				
				}
			}
		}
	
	public static void main(String[] args){
		LinkedListSwap link = new LinkedListSwap();
	
		link.head = new Node(1);
		Node s = new Node(2);
		Node t = new Node(3);
		Node f = new Node(4);
		Node v = new Node(5);
		
		
		link.head.next = s;
		s.next = t;
		t.next = f;
		f.next = v;
		
		link.swap(1, 2);
		
		System.out.println(link.head.next.data);
		
	}
}
