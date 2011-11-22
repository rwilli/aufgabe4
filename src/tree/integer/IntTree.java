package tree.integer;

import tree.IntegerNode;
import tree.Node;
import tree.StackNode;


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
		
		StackNode stackNode;
		
		if (this.rootNode != null) 
			stackNode = new StackNode(this.rootNode);
		else 
			return "Nicht gefunden";
		
		  while (stackNode != null) {                  // solange Keller noch Baeume enthaelt

		        Node n = stackNode;                // besorge Baum aus Keller
		        StackNode p = stackNode.getPreviousNode();
		        stackNode = null;                         // und entferne obersten Eintrag
		        
		        do {
		            System.out.println(((IntegerNode) n).getLabel());          // gib Wert der Baumwurzel aus
		         
		            if (n.getRight() != null){       // falls es rechten Sohn gibt,
		                stackNode = new StackNode(n.getRight());        // lege rechten Sohn auf den Keller
		                stackNode.setPreviousNode(p);
		            }
		            n = n.getLeft();                 // gehe zum linken Sohn
		        } while (n != null);             // solange es linken Sohn gibt
		    }
		  
		  return "";
		
	/*	
		public class TiefenSuche {

			  public static void tiefenSuche (Baum wurzel) { // starte bei wurzel 

			    Baum b;                               // Hilfsbaum

			    Keller k = new Keller();              // konstruiere einen Keller

			    if (!wurzel.empty()) k.push(wurzel);  // lege uebergebenen Baum in Keller

			    while (!k.empty()) {                  // solange Keller noch Baeume enthaelt

			        b = (Baum)k.top();                // besorge Baum aus Keller
			        k.pop();                          // und entferne obersten Eintrag
			        
			        do {
			            IO.print(b.value());          // gib Wert der Baumwurzel aus
			            if (!b.right().empty())       // falls es rechten Sohn gibt,
			                k.push(b.right());        // lege rechten Sohn auf den Keller
			            b = b.left();                 // gehe zum linken Sohn
			        } while (!b.empty());             // solange es linken Sohn gibt
			    }
			  }
			}
			*/
	}
	
	

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
		return search(node).equals("Knoten wurde nicht gefunden") ? false: true;

	}
	
}
