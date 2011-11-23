
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

		// depth >= 0.
		try {
			root.setDepthNode(0);
		} catch (IllegalValueException e) {
			e.printStackTrace();
		}
		stack.push(root);

		while (stack.size() > 0) {

			Node temp = (Node) stack.pop();

			if (temp != null) {
				if (temp.getLeftNode() != null) {
					int leftOfTempDepth =  temp.getDepthNode() + 1;
					
					// depth >= 0.
					try {
						temp.getLeftNode().setDepthNode(leftOfTempDepth);
					} catch (IllegalValueException e) {
						e.printStackTrace();
					}
					stack.push(temp.getLeftNode());
				}

				if (temp.getRightNode() != null) {
					int rightOfTempDepth = temp.getDepthNode() + 1;
					
					// depth >= 0.
					try {
						temp.getRightNode().setDepthNode(rightOfTempDepth);
					} catch (IllegalValueException e) {
						e.printStackTrace();
					}
					stack.push(temp.getRightNode());
				}
			}

		}

	}
}
