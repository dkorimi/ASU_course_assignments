
public class LinkedListPush {
	
	 Node head;
	
	static class Node {
		int data;
		Node next;
		
		Node(int d){data = d; next = null;}
	}
	
	public void PushFront(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	public void PushBetween(Node prevNode, int new_data){
		Node new_node = new Node(new_data);
		new_node.next = prevNode.next;
		prevNode.next = new_node;	
	}
	
	public void PushEnd(int new_data){
		Node new_node = new Node(new_data);
		if(head == null)
			head.next = new_node;
		
		new_node.next = null;
		Node n = head;
		while (n.next != null)
			n = n.next;
		
		n.next = new_node;
		return;	
	}
	
	public static void main(String[] args) {
		LinkedListPush link = new LinkedListPush();
		link.head = new Node(4);
		Node two = new Node(5);
		Node three = new Node(6);
		
		link.head.next = two;
		two.next = three;
		
		link.PushFront(1);
		link.PushBetween(two, 7);
		link.PushEnd(8);
		System.out.println(link.head.data);
		System.out.println(two.next.data);
		System.out.println(three.next.data);
	
	}

}
