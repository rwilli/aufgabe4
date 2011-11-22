


public class IntTree extends IntegerTree {
	private String currentPath = "";
	// current node
		private INode currentNode;

	public IntTree() {
		
	}
	
	public IntTree(INode n) {
		this.root = n;
	}
	
	public IntTree(INode n, int l) {
		this.root = n;
		this.root.setLabel(l);
	}
	
	public void replace(String position, String subTree) {
		Replaceable rp = new Replaceable();
		
		rp.replace(this.root, position, subTree);
	}
	
	/*
	 * (non-Javadoc)
	 * @see tree.integer.IntegerTree#search(int)
	 */
	@Override
	public String search(int node) {
		this.currentPath = "";
		
		Stack s = new Stack();
		
		if (this.root != null) 
			s.push(this.root);	
		else 
			return "Knoten wurde nicht gefunden";
		  while ( !s.isEmpty() ) {                  
		        INode n = s.pop();               
		        do {
		        	if((Integer)n.getLabel() == node){
		        		INode p = n.getParentNode();
		        		while(p != null){
		        			if(p.getLeftNode() == n)
		        				this.currentPath =  "left "+this.currentPath;
		        			else
		        				this.currentPath =  "right "+this.currentPath;
		        			n = p; 
		        			p = p.getParentNode();
		        		}
		        		return this.currentPath;
		        	}											
		            if (n.getRightNode() != null){       
		            	s.push(n.getRightNode());       
		            }
		            n = n.getLeftNode();               
		        } while (n != null);           
		    }
		  return "Knoten wurde nicht gefunden";

	}
	
	

	@Override
	public void add(int node) {
		if (this.root == null) {
	        this.root = new Node(node);
	        this.root.setParentNode(null);
	    } else {
	         
	    	INode n = findPlace(this.root, 0);
	    	INode child = new Node(node);
	    	child.setParentNode(n);
	 
	    	if(n.getLeftNode() == null){
	    		n.setLeftNode(child);
	    	}else{
	    		n.setRightNode(child);
	    	}
	    }
	
	}
	

	private INode findPlace(INode node, int depth){

		node.setDepth(depth);
		
		if(node.getLeftNode() ==null || node.getRightNode() == null){
			return node;
		}else{
			depth++;
			INode n1,n2;
			n1 = findPlace(node.getLeftNode(), depth);
			n2 = findPlace(node.getRightNode(), depth);
			
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
