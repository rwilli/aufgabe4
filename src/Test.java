import tree.IntegerNode;
import tree.Node;
import tree.StringNode;
import tree.Tree;
import tree.integer.IntTree;
import tree.string.InorderTree;
import tree.string.PostorderTree;
import tree.string.PreorderTree;
import tree.string.SortedTree;

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
		
		/*
		 * Testcase IntTree
		 * 
		 * first create IntTree instance
		 * second add rootElement
		 * then try methods
		 */
		IntTree t = new IntTree();
		t.add(2);
		t.add(3);
		t.add(5);
		t.add(9);
		t.add(14);
		t.add(4);
		t.add(34);
		t.add(22);
		System.out.println(t.contains(2));
		
		// Testcase PreorderTree
		Tree pt = new PostorderTree();
		((SortedTree) pt).add("D");
		((SortedTree) pt).add("G");
		((SortedTree) pt).add("B");
		((SortedTree) pt).add("A");
		((SortedTree) pt).add("C");
		((SortedTree) pt).add("F");
		((SortedTree) pt).add("I");
		((SortedTree) pt).add("H");
		((SortedTree) pt).add("J");
		
		// search method finds node
		System.out.println(((SortedTree) pt).search("H"));
		
		// search method fails no node with given label in the tree
		System.out.println(((SortedTree) pt).search("X"));
		
		//System.out.println(((InorderTree) pt).traverse());
		System.out.println(((PostorderTree) pt).traverse());
	}

}
