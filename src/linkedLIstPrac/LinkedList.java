package linkedLIstPrac;

public class LinkedList {
	Node head;
	public LinkedList() {
		this.head = null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.insertAtBeginning(24);
		list.insertAtPosition(0, 1000);
		list.insertAtEnd(0);
		list.insertAtEnd(30);
		list.print();
		list.insertAtEnd(10);
		list.insertAtPosition(3, 2000);
		list.print();
		list.deleteByPosition(5);
		list.print();
		list.deleteByValue(2000);
		list.print();
		list.search(0);
		
		list.print();
	}
	public void insertAtBeginning(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void insertAtEnd(int data) {
		Node current = head;
		
		if(head == null) {
			insertAtBeginning(data);
			
		}else {
			Node newNode = new Node(data);
			while(current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	
	}
	public int getSize() {
		int size = 0;
		Node current = head;
		while (current != null) {
			size++;
			current = current.next;
			
		}
		return size;
	}
	public void insertAtPosition(int position, int data) {
		if(position < 0 ) {
			System.out.println("index out of bound less than zero");
		}
		if(position == 0) {
			insertAtBeginning(data);
		}else {
			Node current= head;
			int counter = 0;
			while(current != null ) {
				if(position-1 == counter) {
					Node newNode = new Node(data);
					newNode.next = current.next;
					current.next = newNode;
					return;
				}
				current  = current.next;
				counter++;
			}
			if(current == null) {
				System.out.println("index out of bound");
				return;
			}
						
		}
	
	}
	public boolean search (int data) {
		Node current  = head;
		while(current!= null) {
			if(current.data == data) {
				return true;
			}else {
				current =  current.next;
			}
		}
		
		return false;
	}
	public void deleteByPosition(int position) {
		if(position<0 || position > getSize()-1) {
			System.out.println("position out of range");
			return;
		}
		else if(position ==0) {
			head = head.next;
			return;
		}else if(position == getSize()-1) {
			Node current = head;
			while (current.next.next != null ) {
				current = current.next;
			}
			current.next = null;
			return;
			
		}
		else {
			Node current = head;
			int counter = 0;
			
			while (current != null && current.next!= null) {
				if(counter == position-1) {
					current.next = current.next.next;
				}
				current = current.next;
				counter++;
			}
			
			
		}
		
		
	}
	public void deleteByValue(int data) {
		if(!search(data)) {
			System.out.println("this value doesnt exist in the linked list to delete");
			return;
		}
		if(head.data == data) {
			head = head.next;
			return;
		}
		Node current = head;
		while(current.next.data != data  ) {
			current = current.next;
		}
		current.next = current.next.next;
	}
	public void print() {
		if(head == null) {
			System.out.println("list is empty to print");
			return;
		}
		Node current = head;
		while(current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println();
	}

}
