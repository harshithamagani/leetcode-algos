package exmaple.com.doubly.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class DoublyLinkedList<T> {
	public Node<T> head;
	public Node<T> tail;
	
	DoublyLinkedList(){
		this.head=null;
		this.tail=null;
	}
	
	public int findLength(){
		Node<T> current = head;
		int count =0;
		while(current!=null) {
			current = current.next;
			count++;
		}
		return count;
	}
	
	public void insertAtFrontNode(T data) {
		Node<T> newNode = new Node<T>(data);
		if(head == null && tail==null) {
			head = newNode;
			tail = newNode;
		}
		else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}
	
	public void insertAtBacktNode(T data) {
		Node<T> newNode = new Node<T>(data);
		if(head == null && tail==null) {
			head = newNode;
			tail = newNode;
		}
		else {
			newNode.prev = tail;
			tail.next = newNode;
			tail= newNode;
		}
	}
	
	public void print() {
		Node<T> currNode= head;
		while(currNode != null) {
			System.out.println(currNode.data);
			currNode = currNode.next;
		}
	}
	
	public void reverse() {
		Node<T> temp = null;
		Node<T> temp2 = null;
		Node<T> current = head;
		while(current != null) {
			temp = current.prev;
			current.prev = current.next;
			current.next = temp;
			temp2= current;
			current = current.prev;
		}
		if(temp2 != null) {
			tail = head;
			head = temp2;
		}
	}
	
	public void printUsingTail(){
		Node<T> current =  tail;
		while(current != null) {
			System.out.println(current.data);
			current = current.prev;
		}
	}
	
	public boolean detectLoop() {
		Node<T> slow =  head;
		Node<T> fast =  head;
		while(slow != null && fast!=null && fast.next!=null) {
			if(slow == fast) {
				return true;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		return false;
	}
	
	public Node<T> findMiddle(){
		Node<T> slow = head;
		Node<T> fast = head;
		while(slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	public void removeDulipcates() {
		Map<T, Integer> map = new HashMap<T, Integer>();
		Node<T> current = head;
		Node<T> previous = null;
		if(current == null) {
			return;
		}
		if(current != null && current.next == null) {
			return;
		}
		previous = current;
		map.put(previous.data, 1);
		current = current.next;
		while(current.next != null) {
			if(!map.containsKey(current.data)) {
				map.put(current.data, 1);
			}
			else {
				previous.next=current.next;
				current.next.prev = previous;
			}
			previous = current;
			current = current.next;
		}
		System.out.println(current.data);
		System.out.println(previous.data);
			if(map.containsKey(current.data)) {
				previous.next = null;
			}
		
	}
	
	public static void main(String[] args) {
		DoublyLinkedList<Integer> d = new DoublyLinkedList<Integer>();
		d.insertAtFrontNode(1);
		d.insertAtFrontNode(2);
		d.insertAtFrontNode(3);
		d.insertAtFrontNode(4);
		//d.print();
		d.reverse();
		//System.out.println("Length: " +d.findLength());
		//d.print();
		//System.out.println("Reverse");
		//d.printUsingTail();
		
		//d.tail.next = d.head;
		//System.out.println(d.detectLoop());
		Node<Integer> middle = d.findMiddle();
		//System.out.println("Middle: "+middle.data);
		d.insertAtFrontNode(4);
		d.insertAtFrontNode(4);
		d.insertAtFrontNode(2);
		d.insertAtBacktNode(4);
		d.print();
		System.out.println("Original: ");
		d.removeDulipcates();
		System.out.println("Rmoval: ");
		d.print();
		System.out.println("Reverse Rmoval: ");
		d.printUsingTail();
	}	
	
}
