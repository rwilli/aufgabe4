package tree.string;

import node.INode;

public abstract class StringTree {
	protected INode root;
	
	// tree search path
	protected String searchPath = "";
		
	// tree output
	private String output = "";
	String turn = "-";
		
	/**
	 * Check if tree contains given string.
	 * Returns true if tree contains node
	 * labeled with string node, otherwise 
	 * returns false
	 * 
	 * @param node string to search
	 * @return return true if tree contains node, otherwise false
	 */
	public abstract boolean contains(String node);
		
	/**
	 * Search tree for label with string node.
	 * Returns search path. If node not found,
	 * return "Knoten wurde nicht gefunden".
	 * 
	 * @param node string to search
	 * @return path to string node
	 */
	public abstract String search(String node);
	
	/**
	 * Adds new node with given string label
	 * 
	 * @param node string to add
	 */
	public abstract void add(String node);
	
	public String toString() {
        return "StringTree toString()";
    }

	private String toStringHelper(INode node) {
		if (node == null) 
			return "";
		
		String p = toStringHelper(node.getLeftNode());
		p += toStringHelper(node.getRightNode());
		p = p + node.getLabel() + "-";
		System.out.print(p);
		System.out.print("\n");
		
		return p;
		//toStringHelper(node.getLeftNode());	// walk trough left sub-tree
		//toStringHelper(node.getRightNode());	// walk trough right sub-tree
	}
	
	public String printTriangle (int count) {
	    if( count <= 0 ) return "";

	    String p = printTriangle(count - 1);
	    p = p + "*";
	    System.out.print(p);
	    System.out.print("\n");
	    //System.out.print(p);

	    return p;
	 }
	
	public void printTriangle2 (int count) {
		for (int x = 1; x <= count; x++) { 
	        System.out.print("*"); 
	    }
	    System.out.print("\n");
	    if (count == 0) return;
	    printTriangle2(count - 1);
	 }

}
