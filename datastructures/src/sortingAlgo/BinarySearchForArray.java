package sortingAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchForArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		for(int i = 0; i<size; i++)
		{
			System.out.println("Enter element number "+(i+1));
			arr[i]  = sc.nextInt();
		}
		System.out.println("Array created successfully");
		
		Arrays.sort(arr); //sorting the array in ascending order
		
		System.out.println("Prin ting the sorted array");
		for(int i= 0; i<arr.length;i++)
			System.out.print(arr[i]+" ");
		int first =0;
		int last = arr.length-1;
		int mid = (first+last)/2;
		
		System.out.println();
		System.out.println("Enter the elemt to be searched");
		int searchElement = sc.nextInt();
		
		
		while(first <= last)
		{
			if(arr[mid] < searchElement)
				first = mid + 1;
			else if(arr[mid] == searchElement)
			{
				System.out.println("Element fount at position "+(mid+1));
				break;
			}
			else
				last = mid -1;
			
			
			mid = (first+last)/2;
			
			
		}
		
		System.out.println("Program ended");
		

	}

}
