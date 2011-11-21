package tree.integer;

import tree.Tree;

public abstract class IntegerTree extends Tree {
	protected String searchPath = "";
	
	public abstract boolean contains(int node);
	
	public abstract String search(int node);
	
	public abstract void add(int node);

}
