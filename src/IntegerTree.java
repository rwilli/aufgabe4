/**
 * Abstract class IntegerTree represents a
 * binary tree labeled with int.
 * 
 * @author Gruppe222
 *
 */
public abstract class IntegerTree {
	// root node
	protected INode root;
	
	// tree search path
	protected String searchPath = "";
	
	// tree order output
	private String order = "";
	
	/**
	 * Check if tree contains given string.
	 * Returns true if tree contains node
	 * labeled with string node, otherwise 
	 * returns false
	 * 
	 * @param node string to search
	 * @return return true if tree contains node, otherwise false
	 */
	public abstract boolean contains(int node);
	
	/**
	 * Search tree for label with string node.
	 * Returns search path. If node not found,
	 * return "Knoten wurde nicht gefunden".
	 * 
	 * @param node string to search
	 * @return path to string node
	 */
	public abstract String search(int node);
	
	/**
	 * Adds new node with given string label
	 * 
	 * @param node string to add
	 */
	public abstract void add(int node);
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {

		String p = traverseForToString();
		
		// remove dash in front of root
		if (p.startsWith("-"))
			p = p.substring(1, p.length());
		
		return  p;
	}

	/**
	 * 
	 * @param node
	 */
	private void preorderTraverseForToString(INode node) {
		if (node == null)
			return;
	
		this.order += node + "\n";
	
		preorderTraverseForToString(node.getLeftNode());	// walk trough left sub-tree
		preorderTraverseForToString(node.getRightNode()); 	// walk trough right sub-tree
	}

	/**
	 * 
	 * @return
	 */
	public String traverseForToString() {
		if (this.root != null)
			preorderTraverseForToString(this.root);

		return this.order;
	}

	/**
	 * 
	 * @param root
	 */
	public void setDepth(INode root) {
		Stack stack = new Stack();

		root.setDepthNode(0);
		stack.push(root);

		while (stack.size() > 0) {

			Node temp = (Node) stack.pop();

			if (temp != null) {
				if (temp.getLeftNode() != null) {
					int leftOfTempDepth =  temp.getDepthNode() + 1;
					temp.getLeftNode().setDepthNode(leftOfTempDepth);
					stack.push(temp.getLeftNode());
				}

				if (temp.getRightNode() != null) {
					int rightOfTempDepth = temp.getDepthNode() + 1;
					temp.getRightNode().setDepthNode(rightOfTempDepth);
					stack.push(temp.getRightNode());
				}
			}

		}

	}

}
