package tree.string;

import tree.Tree;

/**
 * @author rainer
 *
 */
public abstract class StringTree extends Tree {
	protected String searchPath = "";
	
	public boolean contains(String node) {
		// TODO implement method
		return false;
	}
	
	public abstract String search(String node);
	
	public abstract void add(String node);

}
