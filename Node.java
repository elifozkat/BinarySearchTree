public class Node{

	public String key;
	public int value;

	public Node parent;
	public Node left;
	public Node right;

	public Node(String key, int value) {

		this.key=key;
		this.value=value;
		this.left = null;
		this.right = null;
	}
	
	public String getKey(){
		return key;
	}
	
	public int getValue(){
		return value;
	}
	
	public Node getLeft(){
		return left;
	}
	
	public Node getRight(){
		return right;
	}
	
	public void setLeft(Node node){
		this.left=node;
	}
	public void setRight(Node node){
		this.right=node;
	}

	public void setValue(int i){
		this.value=i;
	}
	
	public void setParent(Node node){
		this.parent=node;
	}
	
	public String toString(Node o){
		String a="";
		a+=o.getKey()+" : "+o.getValue();
		return a;
	}
	
	
}
