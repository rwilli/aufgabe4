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
	
	// parent of this node
	private Node parent;
	
	private int depth;
	
	
	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	/*public boolean isBalanced(){
		
		if(getLeft() != null && getRight() != null )
			return true;
		else
			return false;
	}
	
	public boolean isLeaf(){
		
		if(getLeft() == null && getRight() == null )
			return true;
		else 
			return false;
	}
*/
	/**
	 * Get Parent of this Node
	 * @return parent of this Node, can be null
	 */

	public Node getParent() {
		return parent;
	}

	/**
	 * Set parent of this node, can be null
	 * @param parent
	 */
	public void setParent(Node parent) {
		this.parent = parent;
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
