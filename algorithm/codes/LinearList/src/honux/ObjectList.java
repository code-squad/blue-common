package honux;

public class ObjectList {
	private Object[] array;

	public ObjectList(int size) {
		array = new Object[size];
	}
	
	public boolean empty() {
		return true;
	}
	
	public int size() {
		return array.length;
	}
	
	public Object get(int index) {
		Object o = null;
		return o;
	}
	
	public int indexOf(Object o) {
		return -1;
	}
	
	public void remove(int index) {
		
	}
	
	public void insert(Object o) {
		
	}
	
	public String output() {
		String r="";
		return r;
	}
}
