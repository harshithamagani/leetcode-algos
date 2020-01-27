package algo.leet.code;
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

class Node{
	int val;
	Node next;
	
	Node(int val){
		this.val=val;
		this.next=null;
	}
}

class MinStack {
	int min;
	Node head;
		
	public MinStack() {
       this.head = null;
    }
    
    public void push(int x) {
        Node newNode =  new Node(x);
        if(head == null) {
        	head = newNode;
        	min = newNode.val;
        }
        else {
        	if(min > newNode.val) {
        		min = newNode.val;
        	}
        	newNode.next = head;
        	head = newNode;
        }
    }
    
    
    public void print() {
    	Node current = head;
    	while(current != null) {
    		System.out.println(current.val);
    		current = current.next;
    	}
    }
    
    public void pop() {
    	if(head != null) {
    		head = head.next;
    	}
    	else {
    		return;
    	}
    	min = findMin();
    }
    
    
    public int top() {
    	if(head != null) {
    		return head.val;
    	}
    	else {
    		return 0;
    	}
    }
    
    public int findMin(){
    	int minNum=0;
    	Node current =head;
    	if(head == null) {
    		return 0;
    	}
    	else {
    		minNum = current.val;
	    	while(current != null) {
	    		if(current.val < minNum) {
	    			minNum = current.val;
	    		}
	    		current = current.next;
	    	}
    	}
    	return minNum;
    }
    
    public int getMin() {
        return min;
    }
    
    public static void main(String[] args) {
    	MinStack minStack = new MinStack();
    	minStack.push(-2);
    	minStack.push(0);
    	minStack.push(-3);
    	int min =minStack.getMin();   //--> Returns -3.
    	System.out.println("min:"+min);
    	minStack.pop();
    	int top =minStack.top();     // --> Returns 0.
    	System.out.println("top:"+top);
    	min =minStack.getMin();   //--> Returns -2.
    	System.out.println("min:"+min);
	}
}


