package tree.string;

import node.INode;

public class PreorderTree extends SortedTree {
	
	public PreorderTree() {
		
	}
	
	public PreorderTree(INode n) {
		this.root = n;
	}
	
	public PreorderTree(INode n, String l) {
		this.root = n;
		this.root.setLabel(l);
	}
	
	/* (non-Javadoc)
	 * @see stringtree.SortedTree#traverse()
	 */
	@Override
	public String traverse() {
		if (this.root != null)
			preorderTraverse(this.root);
	    
		return this.order;
	}

	/**
	 * Preorder method
	 * First root node then walk trough the left sub-tree
	 * and then trough the right sub-tree
	 * 
	 * @param node root node
	 */
	private void preorderTraverse(INode node) {
		if (node == null) 
			return;

		this.order += node.getLabel() + " ";
		preorderTraverse(node.getLeftNode());	// walk trough left sub-tree
		preorderTraverse(node.getRightNode());	// walk trough right sub-tree
	}

}
