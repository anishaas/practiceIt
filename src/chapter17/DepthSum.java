package chapter17;

import java.util.ArrayList;
import java.util.HashMap;

import chapter17.IntTree.IntTreeNode;

public class DepthSum {
	
	private int depthSumBFS(IntTree tree) {
		HashMap<Integer, ArrayList<IntTreeNode>> tracker = new HashMap(); 
		ArrayList<IntTreeNode> vals = new ArrayList<IntTreeNode>();
		int level = 1;
		int result = 0;
		//add root to list 
		if(tree.getOverallRoot() != null) {
			vals.add(tree.getOverallRoot());
		}
		
		while(tracker.get(level) != null) {
			vals = new ArrayList<IntTreeNode>();
			int sum = 0;
			for(IntTreeNode n : tracker.get(level)) {
				//add children to new list
				if(n.left != null ) {
					vals.add(n.left);
				}
				if(n.right != null ) {
					vals.add(n.right);
				}
				//calculate sum of current level
				sum += n.data; 
			}
			result += level * sum;
			if(vals.size() > 0) {
				tracker.put(level + 1, vals);
			}
			level++; 
		}	
		return result; 
	}
	        
	    
}
