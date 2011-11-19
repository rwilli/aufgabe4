package tree;

/**
 * @author Gruppe222
 *
 */
public abstract class Node {
	private Node left;
	private Node right;
	
	public Node getLeft() {
		return this.left;
	}
	
	public void setLeft(Node node) {
		this.left = node;
	}
	
	public Node getRight() {
		return this.right;
	}
	
	public void setRight(Node node) {
		this.right = node;
	}

}
