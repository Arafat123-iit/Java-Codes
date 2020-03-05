package Searching;

public class TernarySearch {

	/*
	 * Steps to perform Ternary Search:

First, we compare the key with the element at mid1. If found equal, we return mid1.
If not, then we compare the key with the element at mid2. If found equal, we return mid2.
If not, then we check whether the key is less than the element at mid1. If yes, then recur to the first part.
If not, then we check whether the key is greater than the element at mid2. If yes, then recur to the third part.
If not, then we recur to the second (middle) part.

Binary vs Ternary:
Which of the above two does less comparisons in worst case?
From the first look, it seems the ternary search does less number of comparisons as it makes Log3n recursive calls, but binary search makes Log2n recursive calls. Let us take a closer look.
The following is recursive formula for counting comparisons in worst case of Binary Search.

   T(n) = T(n/2) + 2,  T(1) = 1
The following is recursive formula for counting comparisons in worst case of Ternary Search.

   T(n) = T(n/3) + 4, T(1) = 1
In binary search, there are 2Log2n + 1 comparisons in worst case. In ternary search, there are 4Log3n + 1 comparisons in worst case.

Time Complexity for Binary search = 2clog2n + O(1)
Time Complexity for Ternary search = 4clog3n + O(1)
Therefore, the comparison of Ternary and Binary Searches boils down the comparison of expressions 2Log3n and Log2n . The value of 2Log3n can be written as (2 / Log23) * Log2n . Since the value of (2 / Log23) is more than one, Ternary Search does more comparisons than Binary Search in worst case.
	 */
	
	private int ternarySearch(int [] arr,int key){
		
		int left=0;
		int right= arr.length;
		
		while(left<=right){
			
			int mid1=left+(right-left)/3;
			int mid2=right-(right-left)/3;
			
			if(arr[mid1]==key)return mid1;
			else if(arr[mid2]==key)return mid2;
			else if(arr[mid1]>key)right=mid1-1;
			else if(arr[mid2]<key) left=mid2+1;
			else{
				left=mid1+1;
				right=mid2-1;
			}
		}
		return -1;
	}
	
	private int recursiveTernarySearch(int [] arr,int left,int right,int key){
		
		if(left>right) return -1;
		
		int mid1=left+(right-left)/3;
		int mid2=right-(right-left)/3;
		
		if(arr[mid1]==key) return mid1;
		else if(arr[mid2]==key) return mid2;
		else if( arr[mid1]>key) return recursiveTernarySearch(arr, left, mid1-1, key);
		else if(arr[mid2]<key) return recursiveTernarySearch(arr, mid2+1, right, key);
		else return recursiveTernarySearch(arr, mid1+1, mid2-1, key);
	}
	
	public static void main(String[] args) {
		
		int [] A={1,2,3,4,5,6,7,8,9,55,67,89};
		
		TernarySearch ts=new TernarySearch();
		
		/*
		int index=ts.ternarySearch(A, 89);
		
		if(index==-1)
			System.out.println("Not found");
		else
			System.out.println("Found in :"+ index+" index");
		*/
		
		int index=ts.recursiveTernarySearch(A, 0, A.length-1, 7);
		
		if(index==-1)
			System.out.println("Not found");
		else
			System.out.println("Found in :"+ index+" index");
		

	}

}
