package stack;

import node.INode;

/**
 * 
 * @author Gruppe222
 *
 */
public class StackNode {
	// item to store
	private INode item;
	
	// next stack element
	private StackNode next;
	
	public StackNode() {
		
	}
	
	/**
	 * @return the item
	 */
	public INode getItem() {
		return item;
	}
	/**
	 * @param item the item to set
	 */
	public void setItem(INode item) {
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
