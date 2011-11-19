package tree.string;

import tree.StringNode;

/**
 * @author Gruppe222
 *
 */
public class ReplaceableTree extends StringTree {
	
	public ReplaceableTree() {
		// at beginning tree has no nodes
		
	}
	
	public void replace(String position, String subTree) {
		// TODO implement method
	}

	/* (non-Javadoc)
	 * @see stringtree.StringTree#search(java.lang.String)
	 */
	@Override
	public String search(String node) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see stringtree.StringTree#add(java.lang.String)
	 */
	@Override
	public void add(String node) {
		if (this.rootNode == null && node != null)
	        this.rootNode = new StringNode(node);
	    else if (node != null)
	        this.rootNode = insert((StringNode) this.rootNode, node);
	}

	/**
	 * 
	 * @param node
	 * @param label
	 * @return
	 */
	private StringNode insert(StringNode node, String label) {
		// TODO implement method
		
		return node;
	}

	@Override
	public boolean contains(String node) {
		// TODO Auto-generated method stub
		return false;
	}

}
