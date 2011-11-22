import tree.Tree;
import tree.integer.IntTree;
import tree.integer.IntegerTree;
import tree.string.InorderTree;
import tree.string.PostorderTree;
import tree.string.PreorderTree;
import tree.string.ReplaceableTree;
import tree.string.SortedTree;
import tree.string.StringTree;

/**
 * Testclass
 * 
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
		System.out.println(((StringTree) t).toString());
		
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
		
		((ReplaceableTree) t).add("D");
		((ReplaceableTree) t).add("G");
		((ReplaceableTree) t).add("B");
		((ReplaceableTree) t).add("A");
		((ReplaceableTree) t).add("C");
		((ReplaceableTree) t).add("F");
		((ReplaceableTree) t).add("I");
		((ReplaceableTree) t).add("H");
		((ReplaceableTree) t).add("J");
		
		// show tree method from abstract class Tree
		System.out.println(t.toString());
		
		// contains method from abstract class StringTree
		System.out.println(((StringTree) t).contains("I"));		// should work
		System.out.println(((StringTree) t).contains("X")); 	// should fail
		
		// search method from Replaceable class
		System.out.println(((ReplaceableTree) t).search("H"));		// should work
		System.out.println(((ReplaceableTree) t).search("Z"));		// should fail
		
		// create temp tree for replace method
		Tree t1 = new ReplaceableTree();
		
		((ReplaceableTree) t1).add("H");
		((ReplaceableTree) t1).add("F");
		((ReplaceableTree) t1).add("J");
		((ReplaceableTree) t1).add("I");
		((ReplaceableTree) t1).add("K");
		
		// replace method from Replaceable class
		((ReplaceableTree) t).replace("F", t1.toString());
		
		// show tree method from abstract class Tree
		System.out.println(t.toString());
		
		/*
		 * Testcase IntTree
		 */
		t = new IntTree();
		
		((IntegerTree) t).add(4);
		((IntegerTree) t).add(6);
		((IntegerTree) t).add(8);
		((IntegerTree) t).add(11);
		((IntegerTree) t).add(2);
		((IntegerTree) t).add(3);
		((IntegerTree) t).add(34);
		((IntegerTree) t).add(12);
		
		// show tree method from abstract class Tree
		System.out.println(t.toString());
		
		// contains method from abstract class StringTree
		System.out.println(((IntegerTree) t).contains(11));		// should work
		System.out.println(((IntegerTree) t).contains(99)); 	// should fail
		
		// search method from Replaceable class
		System.out.println(((IntegerTree) t).search(2));		// should work
		System.out.println(((IntegerTree) t).search(67));		// should fail
		
		// create temp tree for replace method
		t1 = new IntTree();
		
		((IntTree) t1).add(23);
		((IntTree) t1).add(7);
		((IntTree) t1).add(14);
		((IntTree) t1).add(9);
		((IntTree) t1).add(12);
		
		// replace method from Replaceable class
		((IntTree) t).replace(2, t1.toString());
		
		// show tree method from abstract class Tree
		System.out.println(t.toString());
	}

}
