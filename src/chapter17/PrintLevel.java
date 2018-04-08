package chapter17;

import chapter17.IntTree.IntTreeNode;

public class PrintLevel {
	
	public void printLevel(int printLevel, IntTreeNode root) {
	    if(printLevel <= 0)
	        throw new IllegalArgumentException();
	    
	    printLevel(root, 1, printLevel);
	}

	private void printLevel(IntTreeNode node, int depth, int printLevel) {

	        if(node != null) {
	            if(depth == printLevel) {
	                System.out.println(node.data);
	            } else {
	                printLevel(node.left, depth + 1, printLevel);
	                printLevel(node.right,depth + 1, printLevel);
	            }
	        }
	    }

}
