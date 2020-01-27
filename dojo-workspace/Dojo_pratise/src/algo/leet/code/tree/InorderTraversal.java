package algo.leet.code.tree;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {
		val = x;
	}
}

public class InorderTraversal {
	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        inorderTraversal(list,root);
        return list;
    }

	private void inorderTraversal(List<Integer> list, TreeNode root) {
		if(root == null) {
			return;
		}
		inorderTraversal(list,root.left);
		list.add(root.val);
		inorderTraversal(list,root.right);
		
	}

	public boolean isSameTree(TreeNode p, TreeNode q) {
	if(p == null && q == null) {
		return true;
	}
	if(p == null || q == null) {
		return false;
	}
	if(p.val != q.val) {
		return false;
	}
	return isSameTree(p.left,q.right) && isSameTree(p.right,q.right);
	
	}
	public static void main(String[] args) {

	}
}
