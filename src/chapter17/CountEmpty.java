package chapter17;

import chapter17.IntTree.IntTreeNode;

public class CountEmpty {
	
	private static void main(String args[]) {
		CountLeftNodes test = new CountLeftNodes();
		IntTree tree = new IntTree(); 
		countEmpty(tree);
	}
	
	private static int countEmpty(IntTree tree) {
	    
	    if(tree.getOverallRoot() == null) {
	        return 1;
	    }
	    
	    IntTreeNode node = tree.getOverallRoot(); 
	    if(node == null || (node.left == null && node.right == null)) {
	        return 2; 
	    }
	    else {
	        IntTree left = new IntTree();
	        left.setOverallRoot(node.left); 
	        IntTree right = new IntTree(); 
	        right.setOverallRoot(node.right);
	        //case 1 subtree
	        if(node.right == null) { 
	            return 1 + countEmpty(left); 
	        } else if(node.left == null) {
	            return 1 + countEmpty(right);
	        } else { 
	            //case 2 subtrees
	            return countEmpty(left) + countEmpty(right); 
	        }    
	    }
	}

}
