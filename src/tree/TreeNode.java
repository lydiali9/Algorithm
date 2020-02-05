package tree;

public class TreeNode {
	// 节点的权
	int value;
	// 左儿子
	TreeNode leftNode;
	// 右儿子
	TreeNode rightNode;
	
	public TreeNode(int value) {
		this.value = value;
	}
	
	// 设置左儿子
	public void setLeftNode(TreeNode leftNode) {
		this.leftNode = leftNode;
	}
	// 设置右儿子
	public void setRightNode(TreeNode rightNode) {
		this.rightNode = rightNode;
	}
	
	// 前序遍
	public void frontShow() {
		// 先遍历当前节点的内容
		System.out.println(value);
		// 左节点
		if(leftNode != null) {
			leftNode.frontShow();
		}
		// 右节点
		if(rightNode != null) {
			rightNode.frontShow();
		}
	}

	public void middleShow() {
		// TODO Auto-generated method stub
		// 左节点
		if(leftNode != null) {
			leftNode.middleShow();
		}
		// 当前节点
		System.out.println(value);
		// 右节点
		if(rightNode != null) {
			rightNode.middleShow();
		}
		
	}

	public void afterShow() {
		// TODO Auto-generated method stub
		// 左节点
		if(leftNode != null) {
			leftNode.afterShow();
		}
		// 右节点
		if(rightNode != null) {
			rightNode.afterShow();
		}
		// 当前根节点
		System.out.println(value);
	}

	public TreeNode frontSearch(int i) {
		TreeNode target = null;
		// 对比当前节点的值
		if(this.value == i) {
			return this;
		} else {
			// 当前节点的值不是要查找的节点
			// 有可能查到，也有可能查不到，查不到的话target还是一个null
			if(leftNode != null) {
				target = leftNode.frontSearch(i);
			}
			// 如果不为空，说明在左儿子节点中已经找到，所以return
			if(target != null) {
				return target;
			}
			// 如果左儿子中没有找到，就来查看右儿子
			if(rightNode != null) {
				target = rightNode.frontSearch(i);
			}
		}
		return target;
	}

	public TreeNode middleSearch(int i) {
		TreeNode target = null;
		
		if(leftNode != null) {
			target = leftNode.middleSearch(i);
		}
		
		if(target != null) {
			return target;
		}
		
		if(this.value == i) {
			return this;
		} else {
			if(rightNode != null) {
				target = rightNode.middleSearch(i);
			}
		}
		return target;
	}

	public TreeNode afterSearch(int i) {
		TreeNode target = null;
		
		if(leftNode != null) {
			target = leftNode.afterSearch(i);
		}
		
		if(target != null) {
			return target;
		}
		
		if(rightNode != null) {
			target = rightNode.afterSearch(i);
		}
		
		if(target != null) {
			return target;
		}
		
		if(this.value == i) {
			return this;
		}
		
		return target;
	}

	public void deleteTree(int i) {
		TreeNode parent = this;
		// 判断左儿子
		if(parent.leftNode != null && parent.leftNode.value == i) {
			parent.leftNode = null;
			return;
		}
		// 判断右儿子
		if(parent.rightNode != null && parent.rightNode.value == i) {
			parent.rightNode = null;
			return;
		}
		// 如果都不是
		// 递归检查并删除左儿子
		parent = leftNode;
		if(parent != null) {
			parent.deleteTree(i);
		}
		// 递归并检查删除右儿子
		parent = rightNode;
		if(parent != null) {
			parent.deleteTree(i);
		}
		
	}
}
