package QueuePrac;

public class QueueUsingLinkedList {
	Node front;
	Node rear;
	int size;
	public QueueUsingLinkedList() {
		front =rear=  null;
		size =0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingLinkedList list = new QueueUsingLinkedList();
		list.enqueue(5);
		list.enqueue(6);
		list.enqueue(7);
		list.printQueue();
		
		System.out.println("POPPED: "+list.dequeue());
		
		list.printQueue();
		System.out.println("PEEKING "+ list.peek());
		list.printQueue();
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return (size ==0);
	}
	public void enqueue(int value) {
		Node newNode = new Node(value);
		if(isEmpty()) {
			front = rear = newNode;
		}else {
			rear.next = newNode;
			rear =newNode;
			
		}
		size++;
	}
	public int dequeue() {
		int value;
		if(isEmpty()) {
			System.out.println("the queue is empty to dequeue");
			return -1;
		}else {
			value = front.data; 
			front = front.next;
			if(front  == rear) {
				front = rear =null;
			}
			size--;
		}
		return value;
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("the queue is empty to dequeue");
			return -1;
		}
		int value;
		value = front.data;
		return value;
	}
	public void printQueue() {
		if(isEmpty()) {
			System.err.println("queue is empty to pritn");
		}else {
			Node current = front;
			while (current != null) {
				System.out.print(current.data +" -> ");
				current = current.next;
			}
			System.out.println();
		}
	}
	

}
