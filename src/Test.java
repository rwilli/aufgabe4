import tree.IntegerNode;
import tree.Node;
import tree.StringNode;
import tree.integer.IntTree;

/**
 * @author Gruppe222
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node n1 = new StringNode("a");
		Node n2 = new IntegerNode(1);
		
		System.out.println(((StringNode) n1).getLabel());
		System.out.println(((IntegerNode) n2).getLabel());
		
		IntTree t = new IntTree();
		System.out.println(t.contains(2));
	}

}
