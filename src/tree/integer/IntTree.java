package tree.integer;

import tree.IntegerNode;


public class IntTree extends IntegerTree {

	// current node
	private IntegerNode currentNode;
		
	// current search path
	private String currentPath;
		
	public IntTree() {
		
	}
	
	public void replace(int position, String subTree) {
		// TODO implement method
	}
	
	/*
	 * (non-Javadoc)
	 * @see tree.integer.IntegerTree#search(int)
	 */
	@Override
	public String search(int node) {
		
		currentNode = (IntegerNode) this.rootNode;
		currentPath = this.searchPath;
		
		boolean found = false;
	
		return null;
		
		
		
	}
	
/*	private boolean searchHelp( IntegerNode currentNode, int node){
	
		if(currentNode != null && node == currentNode.getLabel() ){
			return true;
		}
		else{
			if(currentNode.getLeft() != null){
				searchHelp((IntegerNode) currentNode.getLeft(), node);
			}
			if(currentNode.getLeft() != null){
				searchHelp((IntegerNode) currentNode.getLeft(), node);
			}
			
		}
			
			return false;
		
	}
*/
	@Override
	public void add(int node) {
		if (this.rootNode == null) {
	        this.rootNode = new IntegerNode(node);
	        this.rootNode.setParent(null);
	        //size++;
	    } else {
	         
	    	IntegerNode n = findPlace((IntegerNode) this.rootNode, 0);
	    	IntegerNode child = new IntegerNode(node);
	    	child.setParent(n);
	    	//System.out.println("Node:  " + node);

	    	//System.out.println("new Place:  " + n.getLabel());
	 
	    	if(n.getLeft() == null){
	    		//System.out.println("left");
	    		n.setLeft(child);
	    	}else{
	    		
	    	//System.out.println("right");

	    		n.setRight(child);
	    	}
	    }
	}
	
/*	private IntegerNode insert(IntegerNode node, int label) {
		
		
		
			
		
		if(node.isBalanced() ){
			
			insert( (IntegerNode) node.getLeft(), label );
		}
		
		if( node.isLeaf() ){
			
			IntegerNode n = new IntegerNode(label)
			n.setParent(node);
			node.setLeft(n);
			
		}
		
	
		
		if (node.getLeft() == null)
			node.setLeft(new IntegerNode(label));
		else
			insert((IntegerNode) node.getLeft(), label);
		
		return node;
	}
*/

	private IntegerNode findPlace(IntegerNode node, int depth){

		node.setDepth(depth);
		
		if(node.getLeft() ==null || node.getRight() == null){
			return node;
		}else{
			depth++;
			IntegerNode n1,n2;
			n1 = findPlace((IntegerNode) node.getLeft(), depth);
			n2 = findPlace((IntegerNode) node.getRight(), depth);
			
			if(n1.getDepth() > n2.getDepth())
				return n2;
			else
				return n1;
					
		}	
		
	}
	
	@Override
	public boolean contains(int node) {
		// TODO Auto-generated method stub
		return search(node).equals("Knoten wurde nicht gefunden") ? false: true;

	}
	
}
