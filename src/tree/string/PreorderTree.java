package tree.string;

import tree.StringNode;

/**
 * PreorderTree class extends SortedTree and
 * implements preorder traverse method
 * 
 * @author Gruppe222
 *
 */
public class PreorderTree extends SortedTree {
	// result order
	private String order = "";
	
	/* (non-Javadoc)
	 * @see stringtree.SortedTree#traverse()
	 */
	@Override
	public String traverse() {
		if (this.rootNode != null)
			preOrderTraverse((StringNode) this.rootNode);
	    
		return this.order;
	}
	
	/**
	 * Preorder method
	 * First root node then walk trough the left sub-tree
	 * and then trough the right sub-tree
	 * 
	 * @param node root node
	 */
	private void preOrderTraverse(StringNode node) {
		if (node == null) 
			return;
		
		this.order += node.getLabel() + " ";
		preOrderTraverse((StringNode) node.getLeft());	// walk trough left sub-tree
		preOrderTraverse((StringNode) node.getRight());	// walk trough right sub-tree
	}

}
