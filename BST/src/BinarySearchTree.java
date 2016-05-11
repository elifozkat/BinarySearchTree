public class BinarySearchTree {

	private Node root;
	private int size;

	public BinarySearchTree() {
		root = null;
		this.size = 0;

	}

	public void add(Node node) {
		if (root == null)
			root = node;
		else {
			Node parent = null;
			Node current = root;

			while (current != null) {
			
				if (node.getKey().compareToIgnoreCase(current.getKey()) < 0) {
					parent = current;
					current = current.getLeft();
				} else if (node.getKey().compareToIgnoreCase(current.getKey()) > 0) {
					parent = current;
					current = current.getRight();
				} else {
					
					current.setValue(current.getValue() + 1);
					return;
				}
			}

			if (node.getKey().compareToIgnoreCase(parent.getKey()) < 0)
				parent.setLeft(node);

			else if (node.getKey().compareToIgnoreCase(parent.getKey()) > 0)
				parent.setRight(node);
			node.setParent(parent);
		}
		size++;

	}

	public int size() {
		return size;
	}

	public Node getRoot() {
		return root;
	}

	public boolean contains(Node compare, Node node) {
		if (compare == null)
			return false;
		else if (node.getKey().compareTo(compare.getKey()) == 0) {
			return true;
		} else if (node.getKey().compareTo(compare.getKey()) < 0) {
			return contains(compare.left, node);
		} else if (node.getKey().compareTo(compare.getKey()) > 0) {
			return contains(compare.right, node);
		}
		return false;

	}

	public String toString(Node node) {

		String result = "";
		if (node == null)
			return "";
		result += toString(node.getLeft());
		result += node.getKey() + " : " + node.getValue()+"\r\n";
		result += toString(node.getRight());
		return result;

	}

}
