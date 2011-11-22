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
	
	//predecessor of this node
	private Node predecessor;
	
	/**
	 * Getter predecessor
	 * @return predecessor of this Node
	 * can be null
	 * 
	 */
	public Node getPredecessor() {
		return this.predecessor;
	}

	/**
	 * Setter of predecessor
	 * @param predecessor
	 */
	public void setPredecessor(Node predecessor) {
		this.predecessor = predecessor;
	}

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
