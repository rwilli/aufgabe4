package tree.string;

import tree.Tree;

/**
 * @author rainer
 *
 */
public abstract class StringTree extends Tree {
	
	public boolean contains(String node) {
		// TODO implement method
		return true;
	}
	
	public abstract String search(String node);
	
	public abstract void add(String node);

}