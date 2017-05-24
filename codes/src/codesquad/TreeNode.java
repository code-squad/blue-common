package codesquad;

public class TreeNode {
	public static enum Order {PRE, IN, POST };
	public TreeNode left;
	public TreeNode right;
	//public TreeNode next;
	public int value;
	
	public TreeNode(int v) {
		this.value = v;
		this.left = this.right = null;
	}
	
	/**
	 * 
	 * @param v 찾는 값  
	 * @return 찾았을 경우 노드를 리턴, 못 찾으면 null 리턴 
	 */
	public TreeNode search(int v) {
		TreeNode current = this;
		while(current != null) {
			if (current.value == v)
				return current;
			else if (v < current.value)
				current = current.left;
			else
				current = current.right;
		}
		//current = null 
		return null;
	}
	
	public void insert(int v) {
		TreeNode current = this;
		TreeNode parent = null;
		//find
		while(current != null) {
			parent = current;
			if(current.value == v) {
				this.value = v;
				return;
			}
			else if (v < current.value) {
				current = current.left;
			}
			else {
				current = current.right;
			}	
		}
		
		//insert
		//100% current = null
		TreeNode t = new TreeNode(v);
		if (t.value < parent.value) {
			parent.left = t;
		}
		else {
			parent.right = t;
		}	
	}
	
	public void delete(int v) {
		
		//find v and set parent node
		TreeNode curr = this, parent = null, child = null;

		while(curr != null && curr.value != v) {
			parent = curr;
			if (v > curr.value) {
				curr = curr.right;
			} else
				curr = curr.left;
		}
		
		if (curr == null) 
			return;
		
		//case 3 
		//find successor, smallest node of right subtree
		//opposite is also ok 
		if (curr.left != null && curr.right != null) {
			TreeNode minNode = curr.right;
			TreeNode parentMin = curr;
			
			while (minNode.left != null) {
				parentMin = minNode;
				minNode = minNode.left;
			}
			
			curr.value = minNode.value;
			
			// minNode.delete(minNode.value)
			parent = parentMin;
			curr = minNode;
		}
			
		//for case 2 and 3 
		//set child node 	
		if (curr.left != null) {
			child = curr.left;
		}
		else {
			child = curr.right; //child may be null
		}
		
		//remove current node and link parent and child
		if (parent.left == curr) {
			parent.left = child;
		}
		else {
			parent.right = child;
		}
	}
	
	public void visit(TreeNode t) {
		System.out.print(t.value + " ");
	}	
	
	public void printAll(Order order) {
		switch (order) {
		case IN:
			inorder(this);
			break;
		case PRE:
			preorder(this);
			break;
		case POST:
			postorder(this);
			break;
		}
		System.out.println();
	}
	
	public void preorder(TreeNode t) {
		if (t != null) {
			visit(t);
			preorder(t.left);
			preorder(t.right);
		}
	}
	
	public void inorder(TreeNode t) {
		if (t != null) {
			inorder(t.left);
			visit(t);
			inorder(t.right);
		}
	}
	
	public void postorder(TreeNode t) {
		if (t != null) {
			inorder(t.left);
			inorder(t.right);
			visit(t);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 5, 3, 8, 1, 6, 12, 2, 10 };
		TreeNode root = new TreeNode(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			root.insert(arr[i]);
		}
		
		/*
		 *        5
		 *       / \
		 *      3   8
		 *    /    / \
		 *   1    6   12
		 *    \      / 
		 *     2    10    
 		 */
		
		root.printAll(Order.PRE); //5 3 1 2 8 6 12 10 
		
		for (int i = 0; i < arr.length; i ++)
			System.out.println(root.search(arr[i]).value == arr[i]);
		
		System.out.println(root.search(99) == null);
		
		//case 1
		root.delete(2);
		root.inorder(root); //1 3 5 6 8 10 12
		System.out.println();
		//case 2
		root.delete(3);
		root.inorder(root); //1 5 6 8 10 12
		System.out.println();
		
		//case 3
		root.delete(8);
		root.inorder(root); //1 5 6 10 12
		System.out.println();
		
		//delete root
		root.delete(5);
		root.inorder(root); //1 5 6 10 12
		System.out.println();
	}
}