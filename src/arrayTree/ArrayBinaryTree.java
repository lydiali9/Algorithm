package arrayTree;

public class ArrayBinaryTree {
	int[] data;
	
	public ArrayBinaryTree(int[] data) {
		this.data = data;
	}
	
	public void frontShow(int start) {

		if(data == null || data.length == 0) {
			return;
		}
		// 先遍历当前节点的内容
		System.out.print(data[start]);
		
	}
}

