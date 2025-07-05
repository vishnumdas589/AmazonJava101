package DoublyLinkedLIstPrac;

public class Node <T> {
	T data;
	Node prev;
	Node next;
	public Node(T data){
		this.data = data;
		this.next = null;
		this.prev = null;
		
	}

}
