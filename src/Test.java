import tree.integer.IntTree;
import tree.integer.IntegerTree;
import tree.string.InorderTree;
import tree.string.PostorderTree;
import tree.string.PreorderTree;
import tree.string.ReplaceableTree;
import tree.string.StringTree;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringTree t;
		
		/*
		 * Testcase 1 InorderTree
		 */
		System.out.println("----------Testcase InorderTree----------");
		t = new InorderTree();
		
		t.add("D");
		t.add("G");
		t.add("B");
		t.add("A");
		t.add("C");
		t.add("F");
		t.add("I");
		t.add("H");
		t.add("J");
		
		// show tree method from abstract class Tree
		System.out.println(t.toString());
		
		// contains method from abstract class StringTree
		System.out.println(t.contains("I"));		// should work
		System.out.println(t.contains("X")); 	// should fail
		
		// search method from abstract class SortedTree
		System.out.println(t.search("H"));		// should work
		System.out.println(t.search("Z"));		// should fail
		
		// traverse method from InorderTree class
		System.out.println(((InorderTree) t).traverse());
		
		/*
		 * Testcase 2 PostorderTree
		 */
		System.out.println("----------Testcase PostorderTree----------");
		t = new PostorderTree();
		
		t.add("D");
		t.add("G");
		t.add("B");
		t.add("A");
		t.add("C");
		t.add("F");
		t.add("I");
		t.add("H");
		t.add("J");
		
		// show tree method from abstract class Tree
		System.out.println(t.toString());
		
		// contains method from abstract class StringTree
		System.out.println(t.contains("I"));		// should work
		System.out.println(t.contains("X")); 	// should fail
		
		// search method from abstract class SortedTree
		System.out.println(t.search("H"));		// should work
		System.out.println(t.search("Z"));		// should fail
		
		// traverse method from PostorderTree class
		System.out.println(((PostorderTree) t).traverse());
		
		/*
		 * Testcase 3 PreorderTree
		 */
		System.out.println("----------Testcase PreorderTree----------");
		t = new PreorderTree();
		
		t.add("D");
		t.add("G");
		t.add("B");
		t.add("A");
		t.add("C");
		t.add("F");
		t.add("I");
		t.add("H");
		t.add("J");
		
		// show tree method from abstract class Tree
		System.out.println(t.toString());
		
		// contains method from abstract class StringTree
		System.out.println(t.contains("I"));		// should work
		System.out.println(t.contains("X")); 	// should fail
		
		// search method from abstract class SortedTree
		System.out.println(t.search("H"));		// should work
		System.out.println(t.search("Z"));		// should fail
		
		// traverse method from PostorderTree class
		System.out.println(((PreorderTree) t).traverse());
		
		/*
		 * Testcase 4 ReplaceableTree
		 */
		System.out.println("----------Testcase ReplaceableTree----------");
		t = new ReplaceableTree();
		
		t.add("D");
		t.add("G");
		t.add("B");
		t.add("A");
		t.add("C");
		t.add("F");
		t.add("I");
		t.add("H");
		t.add("J");
		
		// show tree method from abstract class Tree
		System.out.println(t.toString());
		
		// contains method from abstract class StringTree
		System.out.println(t.contains("I"));		// should work
		System.out.println(t.contains("X")); 	// should fail
		
		// search method from abstract class SortedTree
		System.out.println(t.search("H"));		// should work
		System.out.println(t.search("Z"));		// should fail
		
		// create temp tree for replace method
		StringTree t1 = new ReplaceableTree();
		
		t1.add("H");
		t1.add("F");
		t1.add("J");
		t1.add("I");
		t1.add("K");
		
		// replace method from Replaceable class
		((ReplaceableTree) t).replace("F", t1.toString());
		
		// show tree method from abstract class Tree
		System.out.println(t.toString());
		
		/*
		 * Testcase IntTree
		 */
		System.out.println("----------Testcase IntTree----------");
		
		IntegerTree t2 = new IntTree();
		
		t2.add(4);
		t2.add(6);
		t2.add(8);
		t2.add(11);
		t2.add(2);
		t2.add(3);
		
		// show tree method from abstract class Tree
		System.out.println(t2.toString());
		
		// contains method from abstract class StringTree
		System.out.println(t2.contains(11));		// should work
		System.out.println(t2.contains(99)); 	// should fail
		
		// search method from Replaceable class
		System.out.println(((IntTree) t2).search(3));		// should work
		System.out.println(t2.search(67));		// should fail
		
		// create temp tree for replace method
		IntegerTree t3 = new IntTree();
		
		t3.add(23);
		t3.add(7);
		t3.add(14);
		t3.add(9);
		t3.add(12);
		
		// replace method from Replaceable class
		((IntTree) t2).replace("8", t3.toString());
		
		// show tree method from abstract class Tree
		System.out.println(t2.toString());
	}

}
