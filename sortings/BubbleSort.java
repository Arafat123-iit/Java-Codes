package sortings;

import java.util.Scanner;

public class BubbleSort {
	
	/*Bubble sort, sometimes referred to as sinking sort, is a simple sorting algorithm that repeatedly steps through the list, 
	 * compares adjacent elements and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted. 
	 *Worst complexity: n^2
	 *Average complexity: n^2
	 *Best complexity: n
	 *Space complexity: 1
	 *Method: Exchanging
	 *Stable: Yes
	 *Class: Comparison sort 
	 */

	private void bubbleSort(int [] arr)
	{
		for(int i=0;i<arr.length-1;i++)
			for(int j=0;j<arr.length-i-1;j++)
				if(arr[j]>arr[j+1])
				{
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
	}
	
		
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
			int [] a={34,5,2,5,66,3,25};

			BubbleSort b=new BubbleSort();
			
			b.bubbleSort(a);
			
			for(int i=0;i<a.length;i++)
				System.out.print(a[i]+" ");
	}

}
