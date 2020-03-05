package sortings;

public class InsertionSort {

	/*
	 * Insertion sort is a simple sorting algorithm that builds the final sorted array one item at a time. 
	 * It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort.
	 *Worst complexity: n^2
	 *Average complexity: n^2
     *Best complexity: n
     *Space complexity: 1
     *Method: Insertion
     *Stable: Yes
     *Class: Comparison sort
	 */
	
	private void insertionSort(int [] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			int item=arr[i];
			int j=i-1;
			
			while(j>=0 && item>arr[j])
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;		
		}
	}
	
	private static void print(int[] arr) {
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
	}
	
	public static void main(String[] args) {
		
		int [] arr={5,8,9,5,3,23,5,8};
		
		InsertionSort is=new InsertionSort();
		is.insertionSort(arr);
		print(arr);

	}

}
