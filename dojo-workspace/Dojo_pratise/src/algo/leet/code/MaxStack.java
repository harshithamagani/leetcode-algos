package algo.leet.code;

class StackNode{
	int data;
	StackNode next;
	
	StackNode(int data){
		this.data=data;
		this.next=null;
	}
}

public class MaxStack {
	StackNode head;
	int max;
	
	
	public MaxStack() {
		 this.max = Integer.MIN_VALUE;
		 this.head =null;
	}
	
	public void push(int data) {
		StackNode newNode = new StackNode(data);
		if(head == null) {
			head = newNode;
			max = data;
		} else {
			if(max < data) {
				max = data;
			}
			newNode.next = head;
			head = newNode;
		}
	}
	
	public int pop() {
		StackNode temp = head;
		head = temp.next;
		max = findMax();
		return temp.data;
	}
	
	public int top() {
		StackNode top = this.head;
		return top.data;
	}
	
	public int peekMax() {
       return max; 
    }
	
	public int popMax() {
		StackNode runner = this.head;
		int max = Integer.MIN_VALUE;
		while(runner != null) {
			if(max < runner.next.data) {
				max = runner.next.data;
			}
			runner = runner.next;
		}
		if(runner.next != null) {
			runner.next = runner.next.next;
		}else {
			runner.next = null;
		}
		System.out.println("max"+max);
		return max;
	}
	
	public int findMax() {
		StackNode runner = this.head;
		int max = Integer.MIN_VALUE;
		while(runner != null) {
			if(max < runner.data) {
				max = runner.data;
			}
			runner = runner.next;
		}
		return max;
	}
	
public static void main(String[] args) {
	 MaxStack stack = new MaxStack();
	 stack.push(5); 
	 stack.push(1);
	 stack.push(5);
	 System.out.println(stack.top()); //-> 5
	 System.out.println(stack.popMax()); //-> 5
	 System.out.println(stack.top()); //-> 1
	 System.out.println(stack.peekMax()); //-> 5
	 System.out.println(stack.pop()); //-> 1
	 System.out.println(stack.top()); //-> 5
	 
	  
}
	
	
}
