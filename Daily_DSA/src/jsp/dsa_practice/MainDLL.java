package jsp.dsa_practice;

public class MainDLL {
	public static void main(String[] args) {
		DoublyLinkedListImpln dl = new DoublyLinkedListImpln();
		dl.insert(10);
		dl.insert(23);
		dl.insert(24);
		dl.insert(44);
		
		dl.display();
		dl.insert(55);
		dl.displayReverse();
		
		dl.delete();
		dl.display();
		dl.delete();
		dl.display();
		
		dl.deleteFront();
		dl.display();
		dl.deleteFront();
		dl.display();
		
	}

}
