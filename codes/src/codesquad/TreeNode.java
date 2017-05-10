package codesquad;

public class TreeNode {
	public TreeNode left;
	public TreeNode right;
	public int value;
	
	public TreeNode(int v) {
		this.value = v;
		this.left = this.right = null;
	}
	public TreeNode search(int v) {
		TreeNode t = this;		
		while (t!= null) {
			if (v < t.value)
				t = t.left;
			else if (v > t.value)
				t = t.right;
			else return t;
		}
		return t;
	}	
	
	
	public void insert(int v) {
		TreeNode p = null;
		TreeNode t = this;
		while (t!= null) {
			p = t;
			if (v < t.value)
				t = t.left;
			else if (v > t.value)
				t = t.right;
			else {
				p.value = v;
				return;
			}
		}
		t = new TreeNode(v);
		if(p.value > v)
			p.left = t;
		else
			p.right = t;			
	}
	
	public void visit(TreeNode t) {
		System.out.print(t.value + ", ");
	}	
	
	public void printAll() {
		System.out.print("[ ");
		inorder(this);
		System.out.print("]");
	}
	
	public void inorder(TreeNode t) {		
		if (t != null) {
			inorder(t.left);
			visit(t);
			inorder(t.right);
		}
	}

	public static void main(String[] args) {
		TreeNode t = new TreeNode(5);
		t.insert(5);
		t.insert(3);
		t.insert(7);
		t.insert(2);
		t.insert(4);
		t.insert(9);
		
		for (int i = 0; i < 9; i++) {
			TreeNode r = t.search(i);
			if (r == null) {
				System.out.printf("%d null\n", i);			
			} else {
				System.out.printf("%d %d\n", i, r.value);
			}		
		}
		
		t.printAll();
	}
}