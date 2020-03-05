package sortings;

public class QuickSort {

	public void quickSort(int [] A,int low,int high)
	{
		if(low>=high) return;
		
		int p=division(A,low,high);
		
		quickSort(A, low, p-1);
		quickSort(A, p+1, high);
		
	}
	
	private int division(int[] a, int low, int high) {
		
		int t,i,j;
		int pivot=a[high];
		
		for(i=low-1,j=low;j<high;j++)
			if(a[j]<pivot){
				i++;
				t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
			
		t=a[high];
		a[high]=a[i+1];
		a[i+1]=t;
		
		return i+1;
	}
	
	private void print(int[] ar) {
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}



	public static void main(String[] args) {
		
		int [] ar={6,3,1,6,8,3};
		QuickSort q=new QuickSort();
		
		q.quickSort(ar, 0, ar.length-1);
		q.print(ar);
	}
}
