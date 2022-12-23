package sortingAlgo;

public class BullbleSort {

	public static void main(String[] args) {

		int temp  =0;
		
		int array[] = {10,4,43,5,57,91,45,9,7};
		for(int j=array.length;j>0;j--)
		{
		for(int i=0;i<j-1; i++)
		{
			if(array[i]<array[i+1])
			{
				//swapping 
				temp = array[i];
				array[i] = array[i+1];
				array[i+1] = temp;
			}
				
		}
		}
		for(int i =0; i< array.length; i++)
			System.out.print(array[i]+" ");
				
		

	}

}
