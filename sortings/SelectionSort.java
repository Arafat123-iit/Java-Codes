package sortings;

public class SelectionSort {

	public static void main(String[] args) {
		
		int [] arr={5,8,9,5,3,23,5,8};
		
		SelectionSort s=new SelectionSort();
		s.selectionSort(arr);
		s.print(arr);

	}

	/*
	  In computer science, selection sort is an in-place comparison sorting algorithm. It has an O(n²) time complexity,
	  which makes it inefficient on large lists, and generally performs worse than the similar insertion sort. Wikipedia
	  Worst complexity: n^2
	  Average complexity: n^2
	  Best complexity: n^2
	  Space complexity: 1
	  Method: Selection
	  Stable: No
	  Class: Comparison sort
	 */
	

	private void print(int[] arr) {
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
	}
	
	private void selectionSort(int [] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int index=i;
			for(int j=i+1;j<arr.length;j++)
				if(arr[index]>arr[j])
					index=j;
				
			if(index!=i)
			{
				int t=arr[i];
				arr[i]=arr[index];
				arr[index]=t;
			}
		}
	}
	
}
