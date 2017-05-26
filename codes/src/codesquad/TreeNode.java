package codesquad;

public class TreeNode {
	public static enum Order {PRE, IN, POST };
	public TreeNode left;
	public TreeNode right;
	//public TreeNode next;
	public int value;
	public static int size = 0;
	public static TreeNode root;
	
	public static void init(int v) {
		TreeNode n = new TreeNode(v);
		root = n;
	}
	public TreeNode(int v) {
		this.value = v;
		this.left = this.right = null;
		size++;
	}
	
	/**
	 * 
	 * @param v 찾는 값  
	 * @return 찾았을 경우 노드를 리턴, 못 찾으면 null 리턴 
	 */
	public static TreeNode search(int v) {
		TreeNode current = root;
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
	
	public static void insert(int v) {
		TreeNode current = root;
		TreeNode parent = null;
		//find
		while(current != null) {
			parent = current;
			if(current.value == v) {
				// current.value = v;
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
		if (parent == null)
			root = t;
		else {
			if (t.value < parent.value) {
				parent.left = t;
			}
			else {
				parent.right = t;
			}
		}
	}
	
	public static boolean delete(int v) {
		if (root == null)
			return false;
		//find node with v and set its parent node
		TreeNode curr = root;
		TreeNode parent = null;
		TreeNode child = null;
		
		while(curr != null && curr.value != v ) {
			parent = curr;
			if (v > curr.value)
				curr = curr.right;
			else 
				curr = curr.left;			
		}
		
		//v is not in the tree
		if (curr == null) {
			return false;
		}
		
		//case 3 
		//find successor, smallest node of right subtree, and its parent
		if (curr.left != null && curr.right != null) {
			TreeNode min = curr.right;
			TreeNode parentMin = curr;
			
			while(min.left != null) {
				parentMin = min;
				min = min.left;
			}
			
			curr.value = min.value;
			//curr.right.delete(min.value);
			parent = parentMin;
			curr = min;
		}
					
		//for case 2 and 1
		if (curr.right != null) 
			child = curr.right;
		else 
			child = curr.left;
		
		if (curr == root) {
			root = child;
		}
		else {
			if (curr == parent.right) {
				parent.right = child;
			} else  {
				parent.left = child;
			}
		}
		size--;
		return true;
	}
	
	public static void visit(TreeNode t) {
		System.out.print(t.value + " ");
	}	
	
	public static void printAll(Order order) {
			
		System.out.printf("[length: %d ] ", size);
		switch (order) {
		case IN:
			inorder(root);
			break;
		case PRE:
			preorder(root);
			break;
		case POST:
			postorder(root);
			break;
		}
		System.out.println();
	}
	
	public static void preorder(TreeNode t) {
		if (t != null) {
			visit(t);
			preorder(t.left);
			preorder(t.right);
		}
	}
	
	public static void inorder(TreeNode t) {
		if (t != null) {
			inorder(t.left);
			visit(t);
			inorder(t.right);
		}
	}
	
	public static void postorder(TreeNode t) {
		if (t != null) {
			inorder(t.left);
			inorder(t.right);
			visit(t);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 5, 3, 8, 1, 6, 12, 2, 10 };
		TreeNode.init(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			TreeNode.insert(arr[i]);
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
		
		TreeNode.printAll(Order.PRE); //5 3 1 2 8 6 12 10 
		
		for (int i = 0; i < arr.length; i ++)
			System.out.println(TreeNode.search(arr[i]).value == arr[i]);
		
		System.out.println(TreeNode.search(99) == null);
		
		for (int i = 0; i < 15; i++) {
			System.out.println("Delete " + i + ": " + TreeNode.delete(i));
			TreeNode.printAll(Order.IN);
		}	
		
		TreeNode.insert(5);
		TreeNode.insert(3);
		TreeNode.insert(7);
		TreeNode.printAll(Order.PRE);
		TreeNode.printAll(Order.IN);
		TreeNode.printAll(Order.POST);
	}
}