package tree.string;

import tree.StringNode;

/**
 * PostorderTree class extends SortedTree and
 * implements postorder traverse method
 * 
 * @author Gruppe222
 *
 */
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
	 * Postorder method
	 * First walk trough the left sub-tree
	 * then trough the right sub-tree and 
	 * finally the root node
	 * 
	 * @param node root node
	 */
	private void postOrderTraverse(StringNode node) {
		if (node == null) 
			return;
		
		postOrderTraverse((StringNode) node.getLeft());		// walk trough left sub-tree
		postOrderTraverse((StringNode) node.getRight());	// walk trough right sub-tree
		this.order += node.getLabel() + " ";
	}

}
