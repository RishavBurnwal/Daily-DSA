package jsp.dsa_practice;

public class LinkedListImpln {
	Node head = null;
	
	//inserting the element
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
	
	
	//adding element at the front
	void insertFront(int ele) {
		Node n1 = new Node(ele);
		if(head == null) {
			head = n1;
		}
		else {
			n1.next = head;
			head = n1;
			System.out.println(ele+ " has been added before "+n1.data);
		}
	}
	
	
	//displaying all the elements
	void display() {
		if(head == null) {
			System.out.println("Linked List is empty");
		}
		else {
			System.out.println("=========LINKED LIST DATA=========");
			Node temp = head;
			while(temp.next != null) {
				System.out.println(temp.data+ "->");
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}
	
	
	//delete the element from the end
	void delete() {
		if(head == null) {
			System.out.println("Lined list is empty");
		}
		else if(head.next == null) {
			System.out.println(head.data+ " has been deleted");
			head = null;
		}
		else {
			Node temp = head;
			while(temp.next.next != null) {
				temp = temp.next;
			}
			System.out.println(temp.next.data+ " has been deleted");
			temp.next=null;
		}
	}
}





















