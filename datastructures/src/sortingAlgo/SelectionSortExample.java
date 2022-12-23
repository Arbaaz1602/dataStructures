package sortingAlgo;

public class SelectionSortExample {

	public static void main(String[] args) {
		
		int arr[] = {10,56,96,53,45,23,25,63,99,15};
		int min=0;
		int temp = 0;
		
		
		for(int i=0; i<arr.length-1;i++)
		{
			min =i;
			for(int j =i+1; j<arr.length;j++)
			{
				if(arr[j]<arr[min])
					min=j;
			}
			
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
			
		}
		
		
		System.out.println("Sorted array");
		for(int i=0; i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

}
