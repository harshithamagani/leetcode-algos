package exmaple.com.doubly.linkedlist;

public class Node<T> {
	public T data;
	public Node<T> next;
	public Node<T> prev;
	
	Node(T data){
		this.data = data;
		this.next = null;
		this.prev = null;
	}

}
