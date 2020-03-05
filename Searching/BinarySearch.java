package Searching;

/* Binary search has a better asymptotic time complexity than linear search, meaning that it scales better with input size. However, it requires 
* the data to already be sorted and requires random-access capability (the ability to jump to any element of the collection efficiently: 
* for example, an array can do this but a linked list cannot). Linear search does not have these requirements, and is also simpler.
*Generally, if your data is a sorted array (or sorted growable array), you would use binary search; otherwise, use linear search. Unless, 
*of course, your data is in some other type of searchable collection such as a tree, in which case you would use that collection's search procedure. 
*Since linear search is slow, if you are doing repeated linear searches against large collections, you should consider sorting the data or placing 
*the data in some efficiently searchable data structure.
*
*Worst complexity: O(log n)
*Average complexity: O(log n)
*Best complexity: O(1)
*Space complexity: O(1)
*Data structure: Array
*Class: Search algorithm
*/

/*

Linear Search vs Binary Search
Prerequisite:
A linear search scans one item at a time, without jumping to any item .

The worst case complexity is  O(n), sometimes known an O(n) search
Time taken to search elements keep increasing as the number of elements are increased.
A binary search however, cut down your search to half as soon as you find middle of a sorted list.

The middle element is looked to check if it is greater than or less than the value to be searched.
Accordingly, search is done to either half of the given list
Important Differences

Input data needs to be sorted in Binary Search and not in Linear Search
Linear search does the sequential access whereas Binary search access data randomly.
Time complexity of linear search -O(n) , Binary search has time complexity O(log n).
 Linear search performs equality comparisons and Binary search performs ordering comparisons
 
 
 */

public class BinarySearch {

	//Normal Binary Search
	public int binarySearch(int [] arr,int key){
		
		int left=0,right=arr.length-1;
		
		while(left<=right){
			int mid= left+(right-left)/2;
			
			if(arr[mid]==key)
				return mid;
			else if(arr[mid]>key)
				right=mid-1;
			else left=mid+1;
		}
		return -1;
	}
	
	public int binarySearchRecursive(int [] arr,int left,int right,int key){
		
		int mid=left+(right-left)/2;
		
		if(left>right)return -1;
		
		if(arr[mid]==key) return mid;
		else if(arr[mid]>key) return binarySearchRecursive(arr, left, mid-1, key);
		else return binarySearchRecursive(arr, mid+1, right, key);
	}
	
	//Finding Leftmost matched element
	public int binarySearchLeftMost(int [] arr,int key){
		
		int left=0,right=arr.length-1,index=-1;
		
		while(left<=right){
			int mid= left+(right-left)/2;
			
			if(arr[mid]==key){
				index=mid;
				right=mid-1;
			}
			else if(arr[mid]>key)
				right=mid-1;
			else left=mid+1;
		}
		return index;
	}
	
	
	
	public static void main(String[] args) {

		int [] A={1,45,67,69,80,80,80};
		
		BinarySearch bs=new BinarySearch();
	/*	
		int index=bs.binarySearch(A,11);
		
		if(index==-1)
			System.out.println("Not found");
		else
			System.out.println("Found in :"+ index+" index");
	*/
		
	/*	
		int index=bs.binarySearchLeftMost(A,80);
		
		if(index==-1)
			System.out.println("Not found");
		else
			System.out.println("Found in :"+ index+" index");
		*/
		
		int index=bs.binarySearchRecursive(A, 0, A.length-1, 45);
		
		if(index==-1)
			System.out.println("Not found");
		else
			System.out.println("Found in :"+ index+" index");
		
		
		
		
		
		
	}

}
