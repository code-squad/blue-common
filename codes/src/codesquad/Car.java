package codesquad;

public class Car implements Comparable <Car>{
	public Car(double price, String name) {
		super();
		this.price = price;
		this.name = name;
		numOfCar = 0;
	}

	public double price;
	public String name;
	public static int numOfCar;
	
	@Override
	public int compareTo(Car car2) {
		return Double.compare(this.price, car2.price);
	}
	
	@Override
	public String toString() {
		return "Car [price=" + price + ", name=" + name + "]";
	}
	
	
}
