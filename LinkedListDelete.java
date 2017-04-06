
public class LinkedListDelete {

	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){data = d; next = null;}
	}
	
	
	public void Delete(int value){
		Node n = head, prev = null;
			if(n != null && n.data == value){
			    head = n.next;
			    return;
		}
			
			while(n != null && n.data != value){
				prev= n;
				n = n.next;
			}
			
			 if (n == null) return;
			
			prev.next = n.next;
	}
	
	public void DeleteKey(int pos){
		Node n = head, prev = null;
		int val = 0;
		if(n != null && val == pos) {
			head = n.next;
			return;
		}
		
		while( n != null) {
			if(val == pos) {
				n = n.next;
			}
			val ++;
		}
		//prev.next = n.next;
		System.out.println(n.next.data);
	}
	
	public static void main(String[] args){
		LinkedListDelete link = new LinkedListDelete();
		link.head = new Node(1);
		Node s = new Node(2);
		Node t = new Node(3);
		
		link.head.next = s;
		s.next = t;
		
		link.Delete(3);
		link.DeleteKey(1);
		
		System.out.println(s.next);
		System.out.println(link.head.data);
		
		
	}
}
