package node;

/**
 * Interface INode implements all necessary
 * node methods for a tree
 * 
 * @author Gruppe222
 *
 */
public interface INode {
	/**
	 * Getter Label
	 * 
	 * @return label of the node
	 */
	public Object getLabel();
	
	/**
	 * Setter Label
	 * 
	 * @param o label to set
	 */
	public void setLabel(Object o);
	
	/**
	 * Getter ParentNode
	 * 
	 * @return parent node
	 */
	public INode getParentNode();
	
	/**
	 * Setter ParentNode
	 * 
	 * @param n parent node to set
	 */
	public void setParentNode(INode n);
	
	/**
	 * Getter LeftNode
	 * 
	 * @return left child node
	 */
	public INode getLeftNode();
	
	/**
	 * Setter LeftNode
	 * 
	 * @param n node to set as left child
	 */
	public void setLeftNode(INode n);
	
	/**
	 * Getter RightChild
	 * 
	 * @return right child node
	 */
	public INode getRightNode();
	
	/**
	 * Setter RightChild
	 * 
	 * @param n node to set as right child
	 */
	public void setRightNode(INode n);
	
	/**
	 * Getter Depth
	 * 
	 * @return depth
	 */
	public int getDepth();
	
	/**
	 * Setter Depth
	 * 
	 * @param d depth to set
	 */
	public void setDepth(int d);
}
