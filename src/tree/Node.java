package tree;

/**
 * Abstract class Node stands for a treenode
 * 
 * @author Gruppe222
 *
 */
public abstract class Node {
	// left child
	private Node left;
	
	// right child
	private Node right;
	
	/**
	 * Getter left child
	 * 
	 * @return left child of the node
	 */
	public Node getLeft() {
		return this.left;
	}
	
	/**
	 * Setter left child
	 * 
	 * @param node to set
	 */
	public void setLeft(Node node) {
		this.left = node;
	}
	
	/**
	 * Getter right child
	 * 
	 * @return right child of the node
	 */
	public Node getRight() {
		return this.right;
	}
	
	/**
	 * Setter right child
	 * 
	 * @param node to set
	 */
	public void setRight(Node node) {
		this.right = node;
	}

}
