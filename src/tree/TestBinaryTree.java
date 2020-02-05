package tree;

public class TestBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建一颗树
		BinaryTree binTree = new BinaryTree();
		// 创建一个根节点
		TreeNode root = new TreeNode(1);
		// 把根节点赋值给树
		binTree.setRoot(root);
		// 创建一个左节点
		TreeNode rootL = new TreeNode(2);
		// 把新创建的节点设置为根节点的子节点
		root.setLeftNode(rootL);
		// 创建一个右节点
		TreeNode rootR = new TreeNode(3);
		// 把新创建的节点设置为根节点的子节点
		root.setRightNode(rootR);
		// 为第二层的左节点创建两个子节点
		rootL.setLeftNode(new TreeNode(4));
		rootL.setRightNode(new TreeNode(5));
		// 为第二层的右节点创建两个子节点
		rootR.setLeftNode(new TreeNode(6));
		rootR.setRightNode(new TreeNode(7));
		
		System.out.println("========前序=========");
		// 前序遍历树 1 2 4 5 3 6 7
		binTree.frontShow();
		System.out.println("========中序=========");
		// 中序遍历 4 2 5 1 6 3 7
		binTree.middleShow();
		System.out.println("========后序=========");
		// 后序遍历 4 5 2 6 7 3 1
		binTree.afterShow();
		
		System.out.println("========前序查找=======");
		TreeNode result = binTree.frontSearch(5);
		System.out.println(result);
		System.out.println("========中序查找========");
		TreeNode resultMid = binTree.middleSearch(9);
		System.out.println(resultMid);
		System.out.println("========后序查找========");
		TreeNode resultAfter = binTree.afterSearch(3);
		System.out.println(resultAfter);
		
		System.out.println("========删除节点========");
		binTree.deleteTree(1);
		binTree.frontShow();
	}

}
