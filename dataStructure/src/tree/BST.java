package tree;

class BSTNode {
	public int id;
	public String name;
	public BSTNode left;
	public BSTNode right;
	
	public BSTNode(String name) {
		this.name = name;
	}

	public BSTNode(int id, String name) {
		this.id = id;
		this.name = name;
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
		while (current != null && key != current.name) {
		    if (key.compareTo(current.name)<0)
		        current = current.left;
		    else
		        current = current.right;
		}
		return current;
	}

	public
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
