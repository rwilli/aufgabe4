package tree.string;

import tree.StringNode;

public class PostorderTree extends SortedTree {
	private String order = "";
	
	/* (non-Javadoc)
	 * @see stringtree.SortedTree#traverse()
	 */
	@Override
	public String traverse() {
		if (this.rootNode != null)
			postOrderTraverse((StringNode) this.rootNode);
		
		return this.order;
	}
	
	/**
	 * 
	 * @param node
	 */
	private void postOrderTraverse(StringNode node) {
		if (node == null) 
			return;
		
		postOrderTraverse((StringNode) node.getLeft());		// walk trough left sub-tree
		postOrderTraverse((StringNode) node.getRight());	// walk trough right sub-tree
		this.order += node.getLabel() + " ";
	}

}
