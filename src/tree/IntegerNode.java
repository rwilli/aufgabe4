package tree;


/**
 * IntegerNode class extends Node and
 * stands for a node labeled with integer
 * 
 * @author Gruppe222
 *
 */
public class IntegerNode extends Node {
	// node label
	private int label;

	/**
	 * Constructor
	 * 
	 * @param label integer for the node label
	 */
	public IntegerNode(int label) {
		this.label = label;
	}

	/**
	 * Getter Label
	 * 
	 * @return integer label of the node
	 */
	public int getLabel() {
		return this.label;
	}

}
