package tree.integer;

import tree.Tree;

public abstract class IntegerTree extends Tree {
	
	public boolean contains(int node) {
		// TODO implement method
		if (this.rootNode == null)
			return false;
		
		return true;
	}
	
	public abstract String search(int node);
	
	public abstract void add(int node);

}
