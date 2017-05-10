package codesquad;

import java.util.Random;

public class MySort {
	
	public long start;
	public void start() {
		start = System.currentTimeMillis();
	}
	
	public void end(String str) {
		long time = System.currentTimeMillis() - start;
		System.out.println(str + "time (ms):" + time);
		
	}
	
	public int[] genArray(int size, boolean is_ordered) {
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 2 + 1;
		}
		if (is_ordered)
			return arr;
		shuffle(arr);
		return arr;	
	}
	
	public void shuffle(int[] arr) {
		Random r = new Random();
		int randomIdx;
		for (int idx = arr.length - 1; idx > 0; idx--) {
			randomIdx = r.nextInt(idx + 1);
			swap(arr, randomIdx, idx);	
		}	
	}
	
	public void mergeSort(int[] arr) {
		_mergeSort(arr, 0, arr.length - 1);
	}
	
	private void _mergeSort(int[] arr, int left, int right) {
		int middle = (left + right)/2;
		if (left < right) {
			_mergeSort(arr, left, middle);
			_mergeSort(arr, middle + 1, right);	
		}
		merge(arr, left, middle, right);
	}
	
	private void merge(int[] arr, int left, int middle, int right) {
		
	}
	
	public void insertionSort(int[] arr) {
		for(int index = 1 ; index < arr.length ; index++){
	      int temp = arr[index];
	      int aux = index - 1;

	      while( (aux >= 0) && ( arr[aux] > temp) ) {
	         arr[aux+1] = arr[aux];
	         aux--;
	      }
	      arr[aux + 1] = temp;
	   }
	}
	
	public void print(int[] array) {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for(int i: array) {
			sb.append(i + ", ");
		}
		sb.append("]");
		System.out.println(sb.toString());
	}
	
	public void qsort(int[] array) {
		_qsort(array, 0, array.length - 1);
	}
	
	private void _qsort(int[] array, int left, int right) {
		int pivotIndex = (left + right) / 2;
		
		if (right > left) {
			pivotIndex = partition(array, left, right, pivotIndex);
			_qsort(array, left, pivotIndex - 1);
			_qsort(array, pivotIndex + 1, right);
		}
	}
		
	
	public int partition(int[] array, int left, int right, int pivotIndex) {
	      int pivot = array[pivotIndex];
	      swap(array, pivotIndex, right);
	      int retIndex = left;
	      for (int i = left; i < right; i++){
	    	  	if (array[i] <= pivot) {
	    	  		swap(array, retIndex, i);
	    	  		retIndex++;
	    	  	}
	      }
	      swap(array, right, retIndex);
	      return retIndex;
	}
	
	public void swap(int []arr, int idx1, int idx2) {
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}

	public static void main(String[] args) {
		int size = 10;
		MySort m = new MySort();
		int[] array = m.genArray(size, false);
		m.print(array);
		m.mergeSort(array);
		m.print(array);
	}

}
