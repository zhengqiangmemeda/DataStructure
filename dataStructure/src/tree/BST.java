package tree;

class BSTNode {
	public int key;
	public String value;
	public BSTNode left;
	public BSTNode right;
	
	public BSTNode(String value) {
		this.value = value;
	}

	public BSTNode(int id, String value) {
		this.key = id;
		this.value = value;
	}
}
/** 
 * @ClassName: BST 
 * @Description: TODO()
 * @author zhengqiang
 * @Email 1126686939@qq.com 
 * @date 2018年4月3日 下午10:35:02 
 */
public class BST {

	BSTNode root;
	public BST(){
		this.root=null;
	}
	/**
	 * 
	 * @param key
	 * @return
	 */
	public BSTNode find(String key){
		BSTNode current=root;
		if(current==null)
			return null;
		while (current != null && key != current.value) {
		    if (key.compareTo(current.value)<0)
		        current = current.left;
		    else
		        current = current.right;
		}
		return current;
	}

	public BSTNode insert(String value){
		BSTNode newNode=new BSTNode(value);
		if(root==null){
			root=newNode;
			return newNode;
		}
		BSTNode current=root;
		BSTNode parent=current;
		while(true){
			parent=current;
			if(current.value.compareTo(value)>0){
				current=current.left;
				if(current==null){
					parent.left=newNode;
					return newNode;
				}
			}
				
			else if(current.value.compareTo(value)<0){
				current=current.right;
				if(current==null){
					parent.right=newNode;
					return newNode;
				}
			}
		}	
	}
	 public void toString(BSTNode root) {
	     if (root != null) {
	         toString(root.left);
	         System.out.print(root.value+",");
	         toString(root.right);
	     }
	}    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST b = new BST();
		b.insert("3");b.insert("8");b.insert("1");b.insert("4");b.insert("6");
		//b.insert("2");b.insert("10");b.insert("9");b.insert("20");b.insert("25");
		b.toString(b.root);
	    System.out.println();
		
		BSTNode node01 = b.find("8");
		System.out.println("是否存在节点值为10 => " + node01.value);
		// 是否存在节点值11
		BSTNode node02 = b.find("11");
		System.out.println("是否存在节点值为11 => " + node02);
	}

}
