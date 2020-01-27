package algo.leet.code;

import java.util.ArrayList;

class TreeNode {
   int val;
   TreeNode left;
   TreeNode right;
   TreeNode(int x) { val = x; }
}
public class FlattenBinaryTreeToList {
	public ArrayList<Integer> preOrder(TreeNode root) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		if(root == null) {
			return null;
		}
		return preOrder(root, arr);
	}
	private ArrayList<Integer> preOrder(TreeNode root, ArrayList<Integer> arr) {
		if(root == null) {
			return arr;
		}
		arr.add(root.val);
		preOrder(root.left,arr);
		preOrder(root.right,arr);
		return arr;
	}
	public void flatten(TreeNode root) {
		ArrayList<Integer> arr = preOrder(root);
		int i=1;
		while(arr.size() < i) {
			if(root != null) {
				if(root.right != null) {
					root.right.val = arr.get(i);
					i++;
					root = root.right;
				}
				else {
					TreeNode newNode = new TreeNode(arr.get(i));
					i++;
					root.right = newNode;
					root = root.right;
				}
			}
			else {
				return;
			}
		}
	}
	
}
