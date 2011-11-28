

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
		
		// contains method from abstract class SortedTree
		System.out.println("Contains I: " + t.contains("I"));		// should work
		System.out.println("Contains X: " + t.contains("X")); 		// should fail
		
		// search method from abstract class SortedTree
		System.out.println("Search for H: " + t.search("H"));		// should work
		System.out.println("Search for Z: " + t.search("Z"));		// should fail
		
		// traverse method from InorderTree class
		System.out.println("Traverse: " + ((InorderTree) t).traverse());
		
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
		
		// contains method from abstract class SortedTree
		System.out.println("Contains G: " + t.contains("G"));		// should work
		System.out.println("Contains X: " + t.contains("X")); 		// should fail

		// search method from abstract class SortedTree
		System.out.println("Search for F: " + t.search("F"));		// should work
		System.out.println("Search for Z: " + t.search("Z"));		// should fail

		// traverse method from InorderTree class
		System.out.println("Traverse: " + ((PostorderTree) t).traverse());
		
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
		
		// contains method from abstract class SortedTree
		System.out.println("Contains J: " + t.contains("J"));		// should work
		System.out.println("Contains X: " + t.contains("X")); 		// should fail

		// search method from abstract class SortedTree
		System.out.println("Search for C: " + t.search("C"));		// should work
		System.out.println("Search for Z: " + t.search("Z"));		// should fail

		// traverse method from InorderTree class
		System.out.println("Traverse: " + ((PreorderTree) t).traverse());
		
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
		
		// contains method from abstract class SortedTree
		System.out.println("Contains I: " + t.contains("I"));		// should work
		System.out.println("Contains X: " + t.contains("X")); 		// should fail

		// search method from abstract class SortedTree
		System.out.println("Search for H: " + t.search("H"));		// should work
		System.out.println("Search for Z: " + t.search("Z"));		// should fail
		
		// create temp tree for replace method
		StringTree t1 = new ReplaceableTree();
		
		t1.add("T");
		t1.add("V");
		t1.add("X");
		t1.add("Y");
		t1.add("K");
		
		// show tree method from abstract class Tree
		System.out.println(t1.toString());
		
		// replace method from Replaceable class
		((ReplaceableTree) t).replace("left left left", t1.toString()); // left left left -> node H
		
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
		t2.add(5);
		
		// show tree method from abstract class Tree
		System.out.println(t2.toString());
		
		// contains method from abstract class IntegerTree
		System.out.println("Contains 11: " + t2.contains(11));		// should work
		System.out.println("Contains 99: " + t2.contains(99)); 		// should fail
		
		// search method from IntTree class
		System.out.println("Search for 3: " + ((IntTree) t2).search(3));	// should work
		System.out.println("Search for 67: " + t2.search(67));				// should fail
		
		// create temp tree for replace method
		IntegerTree t3 = new IntTree();
		
		t3.add(23);
		t3.add(7);
		t3.add(14);
		t3.add(9);
		t3.add(12);
		
		// show tree method from abstract class Tree
		System.out.println(t3.toString());
		
		// replace method from Replaceable class
	//	((IntTree) t2).replace("right left", t3.toString());	// right left -> 3
		
		// show tree method from abstract class Tree
		System.out.println(t2.toString());
	}

}
