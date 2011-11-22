


public abstract class SortedTree extends StringTree {
	// current node
	private INode currentNode;

	// current search path
	private String currentPath;
	
	protected String order = "";

	/**
	 * Traverse method
	 * 
	 * @return result of traverse method whitespace-seperated
	 */
	public abstract String traverse();

	@Override
	public boolean contains(String node) {
		return search(node).equals("Knoten wurde nicht gefunden") ? false: true;
	}

	@Override
	public String search(String node) {
		currentNode = this.root;
		currentPath = this.searchPath;
		
		while (currentNode != null && !currentNode.getLabel().equals(node)) {  
			if (node.compareTo((String) currentNode.getLabel()) < 0) {
				currentNode = currentNode.getLeftNode();
				currentPath += "left ";
			} else {
				currentNode = currentNode.getRightNode();
				currentPath += "right ";
			}
		}
		
		return currentNode == null ? "Knoten wurde nicht gefunden" : currentPath;
	}

	@Override
	public void add(String node) {
		if (this.root == null && node != null)
	        this.root = new Node(node);
	    else if (node != null)
	        this.root = insert(this.root, node);
	}

	private INode insert(INode root, String label) {
		if (root == null)
			root = new Node(label);
		// left side
		else if (label.compareTo((String) root.getLabel()) < 0 )
			root.setLeftNode(insert(root.getLeftNode(), label));
		// right side
	    else if (label.compareTo((String) root.getLabel()) >= 0 )
	    	root.setRightNode(insert(root.getRightNode(), label));
		
		return root;
	} 

}
