package tree.integer;

import tree.IntegerNode;
import tree.StringNode;


public class IntTree extends IntegerTree {

	public IntTree() {
		
	}
	
	public void replace(int position, String subTree) {
		// TODO implement method
	}
	
	@Override
	public String search(int node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int node) {
		// TODO Auto-generated method stub
		if (this.rootNode == null) {
	        this.rootNode = new IntegerNode(node);
	        //size++;
	    } else {
	        this.rootNode = insert((IntegerNode) this.rootNode, node);
	    }
	}
	
	private IntegerNode insert(IntegerNode node, int label) {
		if (node == null)
			node = new IntegerNode(label);
		
		if (node.getLeft() == null)
			node.setLeft(new IntegerNode(label));
		else
			insert((IntegerNode) node.getLeft(), label);
		
		return node;
	}

	@Override
	public boolean contains(int node) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
