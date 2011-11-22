package stack;

import tree.Node;

public class Stack {
	private int size;
	private StackNode first;
	
	public Stack() {
		this.size = 0;
		this.first = null;
	}
	
	public boolean isEmpty() {
		return this.first == null;
	}
	
	public int size() {
		return this.size;
	}
	
	public void push(Node item) {
		StackNode oldfirst = this.first;
		this.first = new StackNode();
		this.first.setItem(item);
		this.first.setNext(oldfirst);
		this.size++;
		
	}
	
	public Node pop() {
		if (this.isEmpty())
			return null;
		Node item = this.first.getItem();
		this.first = this.first.getNext();
		this.size--;
		
		return item;
	}

}
