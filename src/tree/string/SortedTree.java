package tree.string;

import tree.StringNode;

/**
 * SortedTree class extends StringTree.
 * Left tree part is smaller than right part
 * and right tree part is equal taller than
 * left part
 * 
 * @author Gruppe222
 *
 */
public abstract class SortedTree extends StringTree {
	// current node
	private StringNode currentNode;
	
	// current search path
	private String currentPath;
	
	/**
	 * Traverse method
	 * 
	 * @return result of traverse method whitespace-seperated
	 */
	public abstract String traverse(); 
	
	/*
	 * (non-Javadoc)
	 * @see tree.string.StringTree#contains(java.lang.String)
	 */
	@Override
	public boolean contains(String node) {
		// TODO improve perhaps?!?!?
		return search(node).equals("Knoten wurde nicht gefunden") ? false: true;
	}

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
	 * Recursive add method for tree
	 * 
	 * @param node root node
	 * @param label to add
	 * @return new node order
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

	/*
	 * (non-Javadoc)
	 * @see tree.Tree#toString()
	 */
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	

}
