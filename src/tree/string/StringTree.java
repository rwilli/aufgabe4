package tree.string;

import tree.Tree;

/**
 * StringTree class extends Tree and
 * stands for a tree with string nodes
 * 
 * @author Gruppe222
 *
 */
public abstract class StringTree extends Tree {
	// tree search path
	protected String searchPath = "";
	
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

}
