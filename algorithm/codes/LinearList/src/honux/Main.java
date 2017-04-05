package honux;

public class Main {

	public static void main(String[] args) {
		/*
		LinearList <Integer> l = new LinearList<>(20);
		l.insert(3);
		int x = l.get(0);
		System.out.println(x);
		*/

		ObjectList ol = new ObjectList(20);	
		ol.insert(3);			
		int y = (Integer) ol.get(0);
		System.out.println(y);
	}

}
