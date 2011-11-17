package tree;


/**
 * @author Gruppe222
 *
 */
public class StringNode extends Node {
	private String label;

	public StringNode(String label) {
		this.label = label;
	}

	public String getLabel() {
		return this.label;
	}
}
