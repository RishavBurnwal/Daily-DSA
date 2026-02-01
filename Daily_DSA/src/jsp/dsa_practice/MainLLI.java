package jsp.dsa_practice;

class MainLLI{
	public static void main(String[] args) {
		LinkedListImpln l = new LinkedListImpln();
		l.insert(10);
		l.insert(20);
		l.insert(3);
		l.insert(45);
		
		l.insertFront(15);
		l.display();
		l.insertFront(62);
		l.display();
		
		l.delete();
		l.delete();
		l.display();

	}
}