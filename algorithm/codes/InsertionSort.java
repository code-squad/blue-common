import java.util.Random;

public class InsertionSort {
	
	public static void sort(int[] array) {

	}

	public static int[] generateIntArray(int size) {
		//how to shuffle
		int[] array = new int[size];
		return array;
	}

	public static boolean isSorted(int[] array) {
		return false;
	}

	public static void shuffle(int[] array) {

	}

	public static void printArray(int[] array) {
		System.out.print("[");
		for (int i: array) {
			System.out.printf(i + ", ");
		}
		System.out.println("]");
	}

	//swap two elements of indices
	public static void swap(int[] array, int idx1, int idx2) {

	}

	//main
	public static void main(String[] args) {
		int[] arr = generateIntArray(20);
		printArray(arr);

		sort(arr);

		//result
		if (isSorted(arr)) {
			System.out.println("Sorted Well");
			printArray(arr);
		} else {
			System.out.println("Something Wrong");
		}
	}
}
