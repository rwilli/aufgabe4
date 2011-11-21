package tree;

/**
 * StringNode class extends Node and
 * stands for a node labeled with string
 * 
 * @author Gruppe222
 *
 */
public class StringNode extends Node {
	// node label
	private String label;

	/**
	 * Constructor
	 * 
	 * @param label string for the node label
	 */
	public StringNode(String label) {
		this.label = label;
	}

	/**
	 * Getter Label
	 * 
	 * @return string label of the node
	 */
	public String getLabel() {
		return this.label;
	}
}
