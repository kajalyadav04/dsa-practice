package com.leetcode;

import java.util.*;

public class BinaryTreeInorder {
//	Definition for a binary tree node.
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> lst = new ArrayList<>();
		inorderHelper(root, lst);
		return lst;

	}

	public List<Integer> inorderHelper(TreeNode root, List<Integer> lst) {
		if (root != null) {
			inorderHelper(root.left, lst);
			lst.add(root.val);
			inorderHelper(root.right, lst);
		}
		return lst;
	}

}
