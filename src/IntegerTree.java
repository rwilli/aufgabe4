


public abstract class IntegerTree {
	protected INode root;
	
	// tree search path
	protected String searchPath = "";
	
	// tree output
	private String output = "";
	
	/**
	 * Check if tree contains given string.
	 * Returns true if tree contains node
	 * labeled with string node, otherwise 
	 * returns false
	 * 
	 * @param node string to search
	 * @return return true if tree contains node, otherwise false
	 */
	public abstract boolean contains(int node);
	
	/**
	 * Search tree for label with string node.
	 * Returns search path. If node not found,
	 * return "Knoten wurde nicht gefunden".
	 * 
	 * @param node string to search
	 * @return path to string node
	 */
	public abstract String search(int node);
	
	/**
	 * Adds new node with given string label
	 * 
	 * @param node string to add
	 */
	public abstract void add(int node);
	
	public String toString() {
		return "INTEGERTREE toString";
	}

}
