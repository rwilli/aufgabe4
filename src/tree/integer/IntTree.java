package tree.integer;

import stack.Stack;
import tree.IntegerNode;
import tree.Node;


public class IntTree extends IntegerTree {

	// current node
	private IntegerNode currentNode;
		
	// current search path
	private String currentPath = "";
		
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
		
		Stack s = new Stack();
		
		if (this.rootNode != null) 
			s.push(this.rootNode);	
		else 
			return "Knoten wurde nicht gefunden";
		  while ( !s.isEmpty() ) {                  
		        Node n = s.pop();               
		        do {
		        	if(((IntegerNode) n).getLabel() == node){
		        		Node p = n.getParent();
		        		while(p != null){
		        			if(p.getLeft() == n)
		        				this.currentPath =  "left"+this.currentPath;
		        			else
		        				this.currentPath =  "right"+this.currentPath;
		        			n = p; 
		        			p = p.getParent();
		        		}
		        		return this.currentPath;
		        	}											
		            if (n.getRight() != null){       
		            	s.push(n.getRight());       
		            }
		            n = n.getLeft();               
		        } while (n != null);           
		    }
		  return "Knoten wurde nicht gefunden";

	}
	
	

	@Override
	public void add(int node) {
		if (this.rootNode == null) {
	        this.rootNode = new IntegerNode(node);
	        this.rootNode.setParent(null);
	    } else {
	         
	    	IntegerNode n = findPlace((IntegerNode) this.rootNode, 0);
	    	IntegerNode child = new IntegerNode(node);
	    	child.setParent(n);
	 
	    	if(n.getLeft() == null){
	    		n.setLeft(child);
	    	}else{
	    		n.setRight(child);
	    	}
	    }
	
	}
	

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
		return search(node).equals("Knoten wurde nicht gefunden") ? false: true;

	}
	
}
