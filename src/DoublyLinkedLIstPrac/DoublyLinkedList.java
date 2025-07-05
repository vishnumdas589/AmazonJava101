package DoublyLinkedLIstPrac;

public class DoublyLinkedList<T> {
	Node<T> head;
	Node<T> tail;
	int size;
	public DoublyLinkedList(){
		this.head = null;
		this.tail = null;
		size =0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
		list.addFrist(34);
		list.addFrist(24);
		list.addLast(44);
		list.addAtPosition(3, 600);
		list.addFrist(34);
		list.printForwardDirection();
		list.printBackwardDirection();
		list.removeFrist();
		list.printForwardDirection();
		list.removelast();
//		list.printForwardDirection();
//		list.removeAtPosition(5);
		list.printForwardDirection();
		list.removeAtPosition(1);
		list.printForwardDirection();
		
	}
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}
		return false;
	}
	public int size() {
		return size;
	}
	public void addFrist(T data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			head = tail = newNode;
		}else {
			newNode.next = head;
			head.prev= newNode;
			head= newNode;	
		}
		size++;
	}
	public void addLast(T data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			head = tail = newNode;
		}else {
			newNode.prev = tail;
			tail.next= newNode;
			tail = newNode;
		}
		size++;
	}
	public T removeFrist() {
		
		if(isEmpty()) {
			System.out.println("list is empty");
			throw new IndexOutOfBoundsException();
		}
		T removed = head.data;
		head = head.next;
		if(head == null) {
			tail = null;
		}else {
			head.prev = null;
		}
		
		size--;
		return removed;
		
	}
	public T removelast() {
		
		if(isEmpty()) {
			System.out.println("list is empty");
			throw new IndexOutOfBoundsException();
		}
		T removed = head.data;
		tail = tail.prev;
		if(tail == null) {
			head = null;
		}else {
			tail.next = null;
		}
		
		size--;
		return removed;
		
	}
	public void addAtPosition(int position, T data) {
		Node newNode = new Node(data);
		if(position<0 || position>size ) {
			System.out.println("position of add at postion OUT OF BOUND");
			throw new IndexOutOfBoundsException();
		}
		if(position ==0 ) {
			addFrist(data);
		}else if(position == size) {
			addLast(data);
		}else {
			Node current = head;
			
			for (int i = 0 ; i < position;i++) {
				current = current.next;
			}
			newNode.next = current;
			newNode.prev = current.prev;
			current.prev.next = newNode;
			current.prev = newNode;
			size ++;
			
		}
		
	}
	public T removeAtPosition(int position) {
		
		if(position<0 || position>size ) {
			System.out.println("position of remove  OUT OF BOUND");
			throw new IndexOutOfBoundsException();
		}
		
		if(position ==0 ) {
			return removeFrist();
		}else if(position == size-1) {
			return removelast();
		}else {
			Node<T> current = head;
			
			for (int i = 0 ; i < position;i++) {
				current = current.next;
			}
			T removedValue = current.data;
			current.prev.next = current.next;
			current.next.prev = current.prev;
			current.next = null;
			current.prev = null;
			
			size --;
			return removedValue;
		}
		
	}
	public void printForwardDirection() {
		Node<T> current = head;
		System.out.println("Forward {");
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("}");
	}
	public void printBackwardDirection() {
		Node<T> current = tail;
		System.out.println("Backward {");
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.prev;
		}
		System.out.println("}");
	}
	
	

}
