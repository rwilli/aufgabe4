package tree.string;

import tree.StringNode;

/**
 * @author Gruppe222
 *
 */
public class InorderTree extends SortedTree {
	private String order = "";
	
	/* (non-Javadoc)
	 * @see stringtree.SortedTree#traverse()
	 */
	@Override
	public String traverse() {
		if (this.rootNode != null)
			inOrderTraverse((StringNode) this.rootNode);
	         
		return this.order;
	}
	
	private void inOrderTraverse(StringNode node) {
		if (node == null) 
			return;
		
		inOrderTraverse((StringNode) node.getLeft());	// walk trough left sub-tree
		this.order += node.getLabel() + " ";
	    inOrderTraverse((StringNode) node.getRight());	// walk trough right sub-tree
	}
}
