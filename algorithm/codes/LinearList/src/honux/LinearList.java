package honux;

public class LinearList <T> {
	private T[] array;

	@SuppressWarnings("unchecked")
	public LinearList(int size) {
		array = (T[]) new Object[size];
	}
	
	public boolean empty() {
		return true;
	}
	
	public int size() {
		return array.length;
	}
	
	public T get(int index) {
		T t = null;
		return t;
	}
	
	public int indexOf(T t) {
		return -1;
	}
	
	public void remove(int index) {
		
	}
	
	public void insert(T t) {
		
	}
	
	public String output() {
		String r = "";
		return r;
	}
}
