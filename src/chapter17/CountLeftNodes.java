package chapter17;

import chapter17.IntTree.IntTreeNode;

public class CountLeftNodes {
	
	private static void main(String args[]) {
		CountLeftNodes test = new CountLeftNodes();
		IntTree tree = new IntTree(); 
		countLeftNodes(tree);
	}
	
	private static int countLeftNodes(IntTree tree) {
	    IntTreeNode node = tree.getOverallRoot();
	    if(node == null) {
	        return 0;
	    } else {
	        IntTree left = new IntTree();
	        left.setOverallRoot(node.left);
	        IntTree right = new IntTree();
	        right.setOverallRoot(node.right);
	        //count only node's left child
	        if(node.left != null) {
	            return 1 + countLeftNodes(left) + countLeftNodes(right); 
	        } else {
	            return countLeftNodes(right); 
	        }
	    }
	}

}
