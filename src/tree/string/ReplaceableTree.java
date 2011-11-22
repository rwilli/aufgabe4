package tree.string;

import node.INode;

public class ReplaceableTree extends StringTree {

	public ReplaceableTree() {
		
	}
	
	public ReplaceableTree(INode n) {
		this.root = n;
	}
	
	public ReplaceableTree(INode n, String l) {
		this.root = n;
		this.root.setLabel(l);
	}
	
	@Override
	public boolean contains(String node) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String search(String node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(String node) {
		// TODO Auto-generated method stub

	}

	public void replace(String position, String subTree) {
		// TODO implement method
	}
}
