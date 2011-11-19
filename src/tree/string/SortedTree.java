package tree.string;

import tree.StringNode;

/**
 * @author Gruppe222
 *
 */
public abstract class SortedTree extends StringTree {
	private StringNode currentNode;
	private String currentPath;
	
	public abstract String traverse(); 
	
	/* (non-Javadoc)
	 * @see stringtree.StringTree#search(java.lang.String)
	 */
	@Override
	public String search(String node) {
		currentNode = (StringNode) this.rootNode;
		currentPath = this.searchPath;
		
		while (currentNode != null && !currentNode.getLabel().equals(node)) {  
			if (node.compareTo(currentNode.getLabel()) < 0) {
				currentNode = (StringNode) currentNode.getLeft();
				currentPath += "left";
			} else {
				currentNode = (StringNode) currentNode.getRight();
				currentPath += "right";
			}
		}
		
		return currentNode == null ? "Knoten wurde nicht gefunden" : currentPath;
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
		if (node == null)
			node = new StringNode(label);
		// left side
		else if (label.compareTo(node.getLabel()) < 0 )
			node.setLeft(insert((StringNode) node.getLeft(), label));
		// right side
	    else if (label.compareTo(node.getLabel()) >= 0 )
	    	node.setRight(insert((StringNode) node.getRight(), label));
		
		return node;
	}

}
