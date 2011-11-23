import java.util.Scanner;



public class Replaceable {
	public void replace(INode root, String position, String subtree) {
		
		if(root == null)
			return;
		System.out.println("Position:  " + position);
		System.out.println("Subtree:  " + subtree);
		
		
		Scanner s = new Scanner(position);
		INode n	= root;
		
		while(s.hasNext()){
			String temp = s.next();
			System.out.println("Temp:  " + temp);

			if(temp.contains("left")){
				n = n.getLeftNode();
				System.out.println("goLeftNode");

			}else{
				n = n.getRightNode();
				System.out.println("goRightNode");

			}
		}
		System.out.println("Node = " + n.getLabel());

		//TODO Subtree an n hängen
		n = createTree(subtree);
		
	}
	
	private INode createTree(String subtree) {
		
		System.out.println("Subtree in Create:  " + subtree);

		if(subtree.isEmpty())
			return null;
		
		Scanner sc = new Scanner(subtree);
		String s = sc.nextLine();
		
		int depth = s.length()-1;
		
		INode  n = new Node();
		
		n.setLabel(s.charAt(s.length()-1));
		
		try {
			n.setDepthNode(depth);
		} catch(IllegalValueException e) {
			e.printStackTrace();
		}
		
		
		if(sc.hasNextLine()){
			INode nLeft = createTree(sc.nextLine());
			if(nLeft != null)
				n.setLeftNode(nLeft);
		}
		while(sc.hasNextLine()){
			
			s = sc.nextLine();
			if(s.length() == depth )
				break;
		}
		if(sc.hasNextLine()){
			INode nRight = createTree(s);
			if(nRight != null)
				n.setRightNode(nRight);
		}
	
		return n;
	}
	

}
