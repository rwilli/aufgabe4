import java.util.Scanner;



public class Replaceable {
	public void replace(INode root, String position, String subtree) {
		
		if(root == null)
			return;
		
		//TODO getNodes from subtree;
		
		
		Scanner s = new Scanner(position);
		INode n	= root;
		
		while(s.hasNext()){
			String temp = s.next();
			if(temp == "left"){
				n = n.getLeftNode();
			}else{
				n = n.getRightNode();
				
			}
		}
		
		//TODO Subtree an n hängen
		
		
	}
	
	private INode createTree(){
		
		
		
		
	}
	

}
