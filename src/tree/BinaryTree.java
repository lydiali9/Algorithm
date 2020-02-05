package tree;

public class BinaryTree {

	TreeNode root;
	
	// 设置根节点
	public void setRoot(TreeNode root) {
		this.root = root;
	}
	
	// 获取根节点
	public TreeNode getRoot() {
		return root;
	}
	
	public void frontShow() {
		if(root != null) {
			root.frontShow();
		}
	}

	public void middleShow() {
		if(root != null) {
			root.middleShow();
		}
	}

	public void afterShow() {
		if(root != null) {
			root.afterShow();
		}
	}

	public TreeNode frontSearch(int i) {
		return root.frontSearch(i);
	}

	public TreeNode middleSearch(int i) {
		return root.middleSearch(i);
	}

	public TreeNode afterSearch(int i) {
		return root.afterSearch(i);
	}

	public void deleteTree(int i) {
		if(root.value == i) {
			root = null;
		} else {
			root.deleteTree(i);
		}
	}

}
