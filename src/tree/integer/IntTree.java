package tree.integer;

import tree.IntegerNode;


public class IntTree extends IntegerTree {

	public IntTree() {
		
	}
	
	public void replace(String position, String subTree) {
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
		IntegerNode result = new IntegerNode(label);
		
		// leftside
		if (label > 0) {
		    if (result.getLeft() != null) {
		    	result.setLeft(insert((IntegerNode) result.getLeft(), label));
		    } else {
		        result.setLeft(new IntegerNode(label));
		        //size++;
		    }
		} else if (label < 0) {
			// rightside
		    if (result.getRight() != null) {
		    	result.setRight(insert((IntegerNode) result.getRight(), label));
		    } else {
		        result.setRight(new IntegerNode(label));
		        //size++;
		    }
		}
		return result;
	}
	
}
