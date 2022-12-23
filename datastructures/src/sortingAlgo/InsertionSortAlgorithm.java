package sortingAlgo;

import java.util.Arrays;

public class InsertionSortAlgorithm {
	
	public static void main(String args[]) {
		int arr[] = { 10, 56, 96, 53, 45, 23, 25, 63, 99, 15 };
		
		int temp = 0;

		for (int i = 1; i < arr.length; i++) {
			temp = arr[i] ;
			int j = i - 1;

			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = temp;

		}

		System.out.println("Sorted array");
		System.out.println(Arrays.toString(arr));
		
	}

}
