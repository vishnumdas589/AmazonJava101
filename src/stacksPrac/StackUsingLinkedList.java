package stacksPrac;

public class StackUsingLinkedList {
	Node top;
	int size;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingLinkedList stack = new StackUsingLinkedList();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.printStack();
		System.out.println("POPPED: " + stack.pop());
		stack.printStack();
		System.out.println("PEEKING: " + stack.peek());
		stack.printStack();
	}
	public StackUsingLinkedList() {
		this.top =null;
		this.size = 0;
	}
	public void push (int val) {
		Node newNode = new Node(val);
		
		newNode.next = top;
		top = newNode;
		size++;			
	}
	
	public boolean isEmpty() {
		return (top == null);
	}
	public int size() {
		return size;
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("is empty stack for pop");
			return -1;
		}
		int value = top.data;
		top= top.next;
		size--;
		return value;
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("is empty stack for pop");
			return -1;
		}
		int value = top.data;
		return value;
	}
	public void printStack() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return;
		}
		Node current = top;
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
		
		
		
	}

}
