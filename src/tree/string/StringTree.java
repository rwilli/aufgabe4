package tree.string;

import tree.Tree;

/**
 * @author rainer
 *
 */
public abstract class StringTree extends Tree {
	protected String searchPath = "";
	
	public abstract boolean contains(String node);
	
	public abstract String search(String node);
	
	public abstract void add(String node);

}
