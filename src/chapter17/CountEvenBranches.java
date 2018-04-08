package chapter17;

import chapter17.IntTree.IntTreeNode;

public class CountEvenBranches {
	
	public int countEvenBranches(IntTreeNode root) {
	    return countEvenBranchesHelper(root); 
	}
	
	private int countEvenBranchesHelper(IntTreeNode node) {
	    if(node == null) { 
	        return 0;
	    }
	    
	    int count = 0; 
	    //increment if node is even
	    if(node.data % 2 == 0 && (node.left != null || node.right != null)) {
	        count++;
	    }
	    
	    return count + countEvenBranches(node.left) + countEvenBranches(node.right); 
	}
}
