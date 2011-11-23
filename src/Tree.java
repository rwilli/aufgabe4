
public abstract class Tree {
	// root node
	protected INode root;

	// tree search path
	protected String searchPath = "";

	// tree order output
	protected String order = "";

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
