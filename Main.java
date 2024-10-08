
public class Main {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.head = new MyInt(30);
		
		list.addFirst(20);
		list.addFirst(10);
			
		list.addLast(40);
		
		MyInt second = list.head.next;
		list.insertAfter(second, 25);
		list.removeFirst();

		list.printList();
		System.out.println("\n" + list.count());
		System.out.println(list.get(2));
	}

}
