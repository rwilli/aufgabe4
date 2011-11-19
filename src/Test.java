import tree.Tree;
import tree.string.InorderTree;
import tree.string.PostorderTree;
import tree.string.PreorderTree;
import tree.string.ReplaceableTree;
import tree.string.SortedTree;
import tree.string.StringTree;

/**
 * @author Gruppe222
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Tree t;
		
		/*
		 * Testcase 1 InorderTree
		 */
		t = new InorderTree();
		
		((SortedTree) t).add("D");
		((SortedTree) t).add("G");
		((SortedTree) t).add("B");
		((SortedTree) t).add("A");
		((SortedTree) t).add("C");
		((SortedTree) t).add("F");
		((SortedTree) t).add("I");
		((SortedTree) t).add("H");
		((SortedTree) t).add("J");
		
		// show tree method from abstract class Tree
		System.out.println(t.toString());
		
		// contains method from abstract class StringTree
		System.out.println(((SortedTree) t).contains("I"));		// should work
		System.out.println(((SortedTree) t).contains("X")); 	// should fail
		
		// search method from abstract class SortedTree
		System.out.println(((SortedTree) t).search("H"));		// should work
		System.out.println(((SortedTree) t).search("Z"));		// should fail
		
		// traverse method from InorderTree class
		System.out.println(((InorderTree) t).traverse());
		
		/*
		 * Testcase 2 PostorderTree
		 */
		t = new PostorderTree();
		
		((SortedTree) t).add("D");
		((SortedTree) t).add("G");
		((SortedTree) t).add("B");
		((SortedTree) t).add("A");
		((SortedTree) t).add("C");
		((SortedTree) t).add("F");
		((SortedTree) t).add("I");
		((SortedTree) t).add("H");
		((SortedTree) t).add("J");
		
		// show tree method from abstract class Tree
		System.out.println(t.toString());
		
		// contains method from abstract class StringTree
		System.out.println(((StringTree) t).contains("I"));		// should work
		System.out.println(((StringTree) t).contains("X")); 	// should fail
		
		// search method from abstract class SortedTree
		System.out.println(((SortedTree) t).search("H"));		// should work
		System.out.println(((SortedTree) t).search("Z"));		// should fail
		
		// traverse method from PostorderTree class
		System.out.println(((PostorderTree) t).traverse());
		
		/*
		 * Testcase 3 PreorderTree
		 */
		t = new PreorderTree();
		
		((SortedTree) t).add("D");
		((SortedTree) t).add("G");
		((SortedTree) t).add("B");
		((SortedTree) t).add("A");
		((SortedTree) t).add("C");
		((SortedTree) t).add("F");
		((SortedTree) t).add("I");
		((SortedTree) t).add("H");
		((SortedTree) t).add("J");
		
		// show tree method from abstract class Tree
		System.out.println(t.toString());
		
		// contains method from abstract class StringTree
		System.out.println(((StringTree) t).contains("I"));		// should work
		System.out.println(((StringTree) t).contains("X")); 	// should fail
		
		// search method from abstract class SortedTree
		System.out.println(((SortedTree) t).search("H"));		// should work
		System.out.println(((SortedTree) t).search("Z"));		// should fail
		
		// traverse method from PostorderTree class
		System.out.println(((PreorderTree) t).traverse());
		
		/*
		 * Testcase 4 ReplaceableTree
		 */
		t = new ReplaceableTree();
		
		((ReplaceableTree) t).add("G");
		((ReplaceableTree) t).add("B");
		((ReplaceableTree) t).add("T");
		((ReplaceableTree) t).add("X");
		((ReplaceableTree) t).add("C");
		
		// show tree method from abstract class Tree
		System.out.println(t.toString());
	}

}
