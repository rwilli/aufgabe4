package tree;

/**
 * StackNode simulate a Stack to use in Dept-first-search
 * 
 * @author Gruppe222
 *
 */
public class StackNode extends Node {
	
	private StackNode previousNode;
	
	public StackNode(Node node){
		super(node);
	}

	public StackNode getPreviousNode() {
		return previousNode;
	}

	public void setPreviousNode(StackNode previousNode) {
		this.previousNode = previousNode;
	}
	

	

}
