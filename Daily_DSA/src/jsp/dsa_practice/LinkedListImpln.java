package jsp.dsa_practice;

public class LinkedListImpln {
	Node head = null;
	void insert(int ele) {
		Node n = new Node(ele);
		if(head == null) {
			head = n;
			System.out.println(ele+ " has been created as head node");
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = n;
			System.out.println(ele+ " had added after "+temp.data);
		}
	}
}

