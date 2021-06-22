package com.learn.ds.arrays;

public class Bitonic {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[] arr = {10,9,8};
	int max = 0;
	binarySearch(arr,0,arr.length-1);
	for(int i=0;i<arr.length;i++)
	{
	    if(i==0) max = arr[0];
	    else if(i == arr.length-1) 
	    {
		if(max < arr[i]) max = arr[i];
	     }
	    else
	    {
		if(arr[i-1] < arr[i] && arr[i+1] < arr[i])
		{
		    max = arr[i];
		    break;
		}
	    }
	}
	System.out.println(max);
    }

    private static void binarySearch(int[] arr,int start,int end) {
	// TODO Auto-generated method stub
	
	while(start < end)
	    
	{
	    int  mid = (start+end)/2;
	    if(arr[mid] > arr[mid+1])
	    {
		end =mid;
	    }
	    else
	    {
		start = mid+1;
	    }
	}
	System.out.println(arr[start]);
    }

}
