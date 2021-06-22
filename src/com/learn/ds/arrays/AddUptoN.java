package com.learn.ds.arrays;

import java.util.Arrays;

public class AddUptoN {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[] arr = {1,21,3,14,5,60,7,6};
	int value = 27;
	int output1,output2 =0;
	Arrays.sort(arr);
	
	
	for(int i=arr.length-1;i>=0;i--)
	{
	    if( Arrays.binarySearch(arr, (value-arr[i])) >=0)
	    {
		System.out.println("Two Values are" + arr[i] +" "+ (value-arr[i]));
	    }
	}

    }

}
