package com.learn.ds.arrays;

public class CeilingNumber {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
		int arr[] = {4,6,10};
		int key = -1;
		System.out.println(getCeiling(arr,0,arr.length-1,key));
    }

    private static int getCeiling(int[] arr, int start, int end,int key) {
	// TODO Auto-generated method stub
	int max =Integer.MIN_VALUE;
	while(start <= end)
	{
	 if(start ==end) 
	  {
	     if(arr[start] > key)
	     {
		 max= arr[start];
		 break;
	     }
	  
		
	     
	     
	  }
	int mid = (start+end)/2;
	if(arr[mid] == key ) return key;
	else if(arr[mid] < key)
	{
	    start = mid+1;
	}else
	{
	    max = arr[mid];
	    end = mid;
	}
	   
	}
	return max;
    }

}
