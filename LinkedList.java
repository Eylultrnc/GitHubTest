public class LinkedList {
	MyInt head, tail;
	
	public void addFirst( int num ) {
		MyInt newInt = new MyInt(num);
		
		newInt.next = head;
		head = newInt;
	}
	
	public void printList() {
		MyInt temp = head;
		while( temp != null ) {
			System.out.print( temp.value + " " );
			temp = temp.next;
		}
	}
	public void addLast( int num ) {
		MyInt newInt = new MyInt(num);
		MyInt temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newInt;
	}
	public int count() {
		int total = 0;
		MyInt temp = head;
		while(temp != null) {
			total++;
			temp = temp.next;
		}
		return total;
	}
	public void insertAfter(MyInt current, int num) {
		MyInt newNum = new MyInt(num);
		newNum.next = current.next;
		current.next = newNum;
	}
	public void removeFirst() {
		head = head.next;
	}
	public int get(int n) {
		MyInt temp = head;
		for(int i=0; i<n-1; i++) {
			temp = temp.next;
		}
		return temp.value;
	}
	
	
	
	
	
}
