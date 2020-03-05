package sortings;

public class MergeSort {

	private void mergesort(int [] A,int low,int high)
	{
		if(low>=high)return;
		
		int mid=low+(high-low)/2;
		
		mergesort(A, low, mid);
		mergesort(A, mid+1, high);
		
		merge(A,low,mid,high);
	}
	
	private void merge(int[] a, int low, int mid, int high) {
		
		int n1,n2;
		
		n1=mid-low+1;
		n2=high-mid;
		
		int [] L1=new int[n1];
		int [] L2=new int[n2];
		
		for(int i=0;i<n1;i++)
			L1[i]=a[low+i];
		
		for(int i=0;i<n2;i++)
			L2[i]=a[mid+i+1];
		
		
		int i=0,j=0;
		int k=low;
		while(i<n1 && j<n2)
		{
			
			if(L1[i]<L2[j])
			{
				a[k]=L1[i];
				k++;
				i++;
			}
			else	
			{
				a[k]=L2[j];
				k++;
				j++;
			}
		}
		
		while(i<n1)
		{
			a[k]=L1[i];
			k++;
			i++;
		}
		
		while(j<n2)
		{
			a[k]=L2[j];
			k++;
			j++;
		}
		
	}
	
	private void print(int[] ar) {
		
		for(int i=0;i<ar.length;i++)
			System.out.print(ar[i]+" ");
		System.out.println();
	}

	public static void main(String[] args) {
	
		int [] ar={6,3,1,6,8,3};
		MergeSort q=new MergeSort();
	
		q.print(ar);
		q.mergesort(ar, 0, ar.length-1);
		q.print(ar);
	}

}
