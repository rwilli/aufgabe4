import java.util.Scanner;



public class Replaceable {
	public void replace(INode root, String position, String subtree) {
		
		if(root == null)
			return;
		
		//TODO getNodes from subtree;
		
		
		Scanner s = new Scanner(position);
		
		while(s.hasNext()){
			
			String temp = s.next();
			
			if(temp == "left"){
				
				//links anhängen
				
			}else{
				
				
				//rechts anhängen
				
			}
			
			
		}
		
		
	}

}
