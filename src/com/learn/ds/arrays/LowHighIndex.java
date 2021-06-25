package com.learn.ds.arrays;

public class LowHighIndex {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[] arr = {1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6, 6};
	//int[] arr = {1,1,1,2,2,2,2,2,3,3,3,4,4,4,4,5,5,5,6,6,6,6,6,6};
	int key = 1;
	int low = findLowIndex(arr,key);
	System.out.println(low);
	int high = findHighIndex(arr,key);
	if( low >= 0 & high > 0) System.out.println("low"+ low + "  "+" high"+ high);
	else System.out.println("Index Not Found");

    }

    private static int findHighIndex(int[] arr, int key) {
	// TODO Auto-generated method stub
	int start = 0;
	int end = arr.length-1;
	int high = -1;
	
	while(start <= end)
	{
	    if(start == end) return high;
		
	    int mid = (start+end)/2;
	    if(arr[mid] == key) 
	    {
		if(end > mid){
		    high = mid; 
		    start = mid+1;
		 }
		
	    }
	    else if(arr[mid] < key)
	    {
		start = mid+1;
	    }
	    else
	    {
		end=mid;
	    }
	    
	    
	}
	return high;
    }

    private static int findLowIndex(int[] arr, int key) {
	// TODO Auto-generated method stub
	int start = 0;
	int end = arr.length-1;
	int low = -1;
	
	while(start <= end)
	{
	    int mid = (start+end)/2;
	    if(arr[mid] == key) 
	    {
		if(start < mid){
		    low = mid; 
		    end = mid;
		 }
		else if(start == mid)
		{
		    low = mid;
		    return low;
		}
	    }
	    else if(arr[mid] > key)
	    {
		end = mid;
	    }
	    else
	    {
		start = mid+1;
	    }
	    
	    
	}
	return low;
	
	
    }

}
