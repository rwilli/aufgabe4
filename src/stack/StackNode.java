package stack;

import tree.Node;

public class StackNode {
	private Node item;
	private StackNode next;
	
	public StackNode() {
		
	}
	
	/**
	 * @return the item
	 */
	public Node getItem() {
		return item;
	}
	/**
	 * @param item the item to set
	 */
	public void setItem(Node item) {
		this.item = item;
	}
	/**
	 * @return the next
	 */
	public StackNode getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(StackNode next) {
		this.next = next;
	}

	
}
