


/**
 * 
 * @author Gruppe222
 *
 */
public class Node implements INode {
	// parent node
	private INode parent;
	
	// left child node
	private INode left;
	
	// right child node
	private INode right;
	
	// node label
	private Object label;
	
	// node depth
	private int depth;
	
	/**
	 * default constructor
	 */
	public Node() {
		
	}
	
	/**
	 * constructor with label object o
	 * 
	 * @param o object for label
	 */
	public Node(Object o) {
		this.label = o;
	}
	
	/**
	 * constructor with label object o
	 * and parent node p
	 * 
	 * @param o object for label
	 * @param p parent node
	 */
	public Node(Object o, INode p) {
		this.label = o;
		this.parent = p;
	}

	/*
	 * (non-Javadoc)
	 * @see node.INode#getLabel()
	 */
	@Override
	public Object getLabel() {
		return this.label;
	}

	/*
	 * (non-Javadoc)
	 * @see node.INode#setLabel(java.lang.Object)
	 */
	@Override
	public void setLabel(Object o) {
		this.label = o;
	}

	/*
	 * (non-Javadoc)
	 * @see node.INode#getParentNode()
	 */
	@Override
	public INode getParentNode() {
		return this.parent;
	}

	/*
	 * (non-Javadoc)
	 * @see node.INode#setParentNode(node.INode)
	 */
	@Override
	public void setParentNode(INode n) {
		this.parent = n;
	}
	
	/*
	 * (non-Javadoc)
	 * @see node.INode#getLeftNode()
	 */
	@Override
	public INode getLeftNode() {
		return this.left;
	}
	
	/*
	 * (non-Javadoc)
	 * @see node.INode#setLeftNode(node.INode)
	 */
	@Override
	public void setLeftNode(INode n) {
		this.left = n;
	}
	
	/*
	 * (non-Javadoc)
	 * @see node.INode#getRightNode()
	 */
	@Override
	public INode getRightNode() {
		return this.right;
	}
	
	/*
	 * (non-Javadoc)
	 * @see node.INode#setRightNode(node.INode)
	 */
	@Override
	public void setRightNode(INode n) {
		this.right = n;
	}

	/* (non-Javadoc)
	 * @see node.INode#getDepth()
	 */
	@Override
	public int getDepth() {
		return this.depth;
	}

	/* (non-Javadoc)
	 * @see node.INode#setDepth(int)
	 */
	@Override
	public void setDepth(int d) {
		this.depth = d;	
	}

}
