package QueuePrac;



public class QueueUsingArray {
	private int [] QueueArray;
	private int Capacity;
	private int front;
	private int rear;
	private int size;
	public QueueUsingArray(int size) {
		
		this.Capacity = size;
		QueueArray = new int [Capacity];
		this.front= 0;
		this.rear = -1;
		this.size = 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingArray list = new QueueUsingArray(10);
		list.enqueue(5);
		list.enqueue(6);
		list.enqueue(7);
		list.printQueue();
		
		System.out.println("POPPED: "+list.dequeue()+ ", "+ "size is "+ list.size);
		
		list.printQueue();
		System.out.println("PEEKING "+ list.peek()+ ", "+ "size is "+ list.size);
		
		System.out.println("POPPED: "+list.dequeue()+ ", "+ "size is "+ list.size);
		list.printQueue();
		System.out.println("POPPED: "+list.dequeue()+ ", "+ "size is "+ list.size);
		list.printQueue();

		

	}
	public boolean isEmpty() {
		return size == 0;
	}
	public boolean isFull() {
		return size() == Capacity;
	}
	public int size() {
		return size;
	}
	public void enqueue(int value) {
		if(isFull()) {
			System.out.println("queue full");
			
		}else{
			rear  = (rear +1) % Capacity;
			QueueArray[rear] = value;
			size++;
		}
		
	}
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("queue is empty to peek");
			return -1;
		}
		int value = peek();
		front  = (front+1)% Capacity;
		size--;
		return value;
		
	}
	public int peek() {
		
		if(isEmpty()) {
			System.out.println("queue is empty to peek");
			return -1;
		}
		return QueueArray[front];
	}
	public void printQueue() {
		int i = front;
		int  j = rear;
		while (i <= j) {
			System.out.print(QueueArray[i]+ "->");
			i++;
		}
		System.out.println();
	}

}
