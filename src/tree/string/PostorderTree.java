package tree.string;

import node.INode;

/**
 * PostorderTree class extends SortedTree and
 * implements postorder traverse method
 * 
 * @author Gruppe222
 *
 */
public class PostorderTree extends SortedTree {

	public PostorderTree() {
		
	}
	
	public PostorderTree(INode n) {
		this.root = n;
	}
	
	public PostorderTree(INode n, String l) {
		this.root = n;
		this.root.setLabel(l);
	}
	
	/* (non-Javadoc)
	 * @see stringtree.SortedTree#traverse()
	 */
	@Override
	public String traverse() {
		if (this.root != null)
			postorderTraverse(this.root);
		
		return this.order;
	}
	
	/**
	 * Postorder method
	 * First walk trough the left sub-tree
	 * then trough the right sub-tree and 
	 * finally the root node
	 * 
	 * @param node root node
	 */
	private void postorderTraverse(INode node) {
		if (node == null) 
			return;
		
		postorderTraverse(node.getLeftNode());		// walk trough left sub-tree
		postorderTraverse(node.getRightNode());	// walk trough right sub-tree
		this.order += node.getLabel() + " ";
	}

}