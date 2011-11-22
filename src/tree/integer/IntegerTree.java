package tree.integer;

import tree.IntegerNode;
import tree.Node;
import tree.Tree;

public abstract class IntegerTree extends Tree {
	protected String searchPath = "";
	private String output = "";
	
	public abstract boolean contains(int node);
	
	/**
	 * 
	 * @param node
	 * @return Gibt den Pfad zurück, wenn der Knoten gefunden wurde, sonst "Knoten wurde nicht gefunden"
	 */
	public abstract String search(int node);
	
	public abstract void add(int node);
	

	public String toString() {

		if (this.rootNode != null){
			walk((IntegerNode) this.rootNode);
		}
		return this.output;
	}

	private void walk(Node node) {
		if (node == null) 
			return;
		
		this.output += ((IntegerNode) node).getLabel() + "\n- ";
		walk( node.getLeft());	// walk trough left sub-tree
		walk( node.getRight());	// walk trough right sub-tree
	}
}
