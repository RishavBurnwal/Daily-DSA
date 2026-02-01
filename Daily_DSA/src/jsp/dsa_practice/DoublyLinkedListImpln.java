package jsp.dsa_practice;

public class DoublyLinkedListImpln {
	Node1 head = null;
	Node1 tail = null;
	void insert(int ele) {
		Node1 n= new Node1(ele);
		if(head==null) {
			head=n;
			tail=n;
		}
		else {
			tail.next=n;
			n.prev=tail;
			tail=n;
		}
		System.out.println(ele+ "has been inserted");
	}
	
	
	void display() {
		if(head == null) {
			System.out.println("Linked List is empty");
		}
		else {
			Node1 temp = head;
			while(temp.next != null) {
				System.out.println(temp.data+ "->");
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
		System.out.println("------------------------------------------");

	}
	
	
	//display in reverse order
	void displayReverse() {
		if(head == null) {
			System.out.println("Linked List is empty");
		}
		else {
			Node1 temp = tail;
			while(temp.prev != null) {
				System.out.println(temp.data+ "->");
				temp = temp.prev;
			}
			System.out.println(temp.data);
		}
		System.out.println("------------------------------------------");

	}
	
	
	//insert Front
	void insertFront(int ele) {
		Node1 n= new Node1(ele);
		if(head == null) {
			head=n;
		}
		else {
			n.next = head;
			head=n;
			System.out.println(ele+" has been inserted at the front");	
		}
		System.out.println("------------------------------------------");
	}
	//delete element
	void delete() {
		if(head == null) {
			System.out.println("Linked List is empty");
		}
		else if(head.next == null) {
			head=null;
			System.out.println("Element has been deleted");
		}
		else {
			Node1 temp=head;
			while(temp.next.next != null) {
				temp = temp.next;
			}
			System.out.println(temp.next.data+" has been deleted");
			temp.next = null;
		}
		System.out.println("----------------------------------");
	}
	
	
	//delete element from front
	void deleteFront() {
		if(head == null) {
			System.out.println("Empty Linked List");
		}
		else if(head.next == null) {
			System.out.println(head.data + " deleted from front");
			head = null;
			tail = null;
		}
		else {
			System.out.println(head.data + " deleted from front");
			head = head.next;
			head.prev = null;
		}
	}


	

}



















