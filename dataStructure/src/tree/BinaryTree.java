package tree;

import java.util.LinkedList;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode(){}
	public TreeNode(int v,TreeNode l,TreeNode r){
		this.val=v;
		this.left=l;
		this.right=r;
	}
}

/** 
 * @ClassName: BinaryTree 
 * @Description: TODO()
 * @author zhengqiang
 * @Email 1126686939@qq.com 
 * @date 2018年4月3日 下午5:07:57 
 */
public class BinaryTree {

	public BinaryTree(){}
	
	//--------------------------------pre order visit------------------------------
	public void preOrderVisitRecursion(TreeNode root){
		if(root!=null){
			System.out.print(root.val+",");
			preOrderVisitRecursion(root.left);
			preOrderVisitRecursion(root.right);
		}
	}
	public void preOrderVisit(TreeNode root){
		
	}
	//-------------------------------in order visit---------------------------------
	public void inOrderVisitRecursion(TreeNode root){
		if(root!=null){
			inOrderVisitRecursion(root.left);
			System.out.print(root.val+",");
			inOrderVisitRecursion(root.right);
		}	
	}
	public void inOrderVisit(TreeNode root){
		
	}
	//-------------------------------post order visit-------------------------------
	public void postOrderVisitRecursion(TreeNode root){
		if(root!=null){
			postOrderVisitRecursion(root.left);
			postOrderVisitRecursion(root.right);
			System.out.print(root.val+",");
		}	
	}
	public void postOrderVisit(TreeNode root){
		
	}
	//-------------------------------level order visit-------------------------------
	public void levelOrderVisit(TreeNode root){
		if(root==null)
			return;
		LinkedList<TreeNode> queue=new LinkedList<TreeNode>();
		TreeNode p=root;
		queue.add(p);
		while(!queue.isEmpty()){
			TreeNode temp=queue.remove();
			System.out.print(temp.val+",");
			if(temp.left!=null){
				queue.add(temp.left);
			}
			if(temp.right!=null){
				queue.add(temp.right);
			}
		}
	}

	public static void main(String[] args) {
		
		/*     test case    
		 *                             1
		 *                       2            3
		 *                   4       5     6     7
		 *                         8   9
		 *                               10
		 *                       
		 */                             
		TreeNode node10=new TreeNode(10,null,null);
		TreeNode node8=new TreeNode(8,null,null);
		TreeNode node9=new TreeNode(9,null,node10);
		TreeNode node4=new TreeNode(4,null,null);
		TreeNode node5=new TreeNode(5,node8,node9);
		TreeNode node6=new TreeNode(6,null,null);
		TreeNode node7=new TreeNode(7,null,null);
		TreeNode node2=new TreeNode(2,node4,node5);
		TreeNode node3=new TreeNode(3,node6,node7);
		TreeNode node1=new TreeNode(1,node2,node3);
		
		BinaryTree tree=new BinaryTree();
		//
		System.out.print("preOrderVisitRecursion: ");
		tree.preOrderVisitRecursion(node1);
		System.out.println();
		
		System.out.print("inOrderVisitRecursion: ");
		tree.inOrderVisitRecursion(node1);
		System.out.println();
		
		System.out.print("postOrderVisitRecursion: ");
		tree.postOrderVisitRecursion(node1);
		System.out.println();
		
		System.out.print("levelOrderVisit: ");
		tree.levelOrderVisit(node1);
		System.out.println();
	}

}
