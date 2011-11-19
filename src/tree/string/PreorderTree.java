package tree.string;

import tree.StringNode;

/**
 * @author Gruppe222
 *
 */
public class PreorderTree extends SortedTree {
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
	
	private void preOrderTraverse(StringNode node) {
		if (node == null) 
			return;
		
		this.order += node.getLabel() + " ";
		preOrderTraverse((StringNode) node.getLeft());	// walk trough left sub-tree
		preOrderTraverse((StringNode) node.getRight());	// walk trough right sub-tree
	}

}
