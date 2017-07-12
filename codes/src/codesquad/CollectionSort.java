package codesquad;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSort {
	
	public static void main(String[] args) {
		ArrayList <Car> list = new ArrayList<Car>();

		list.add(new Car(1000, "소나타"));
		list.add(new Car(2000, "bmw"));
		list.add(new Car(50, "Pony2"));
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		}
}
