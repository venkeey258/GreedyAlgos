package com.learn.ds.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NonRepeating {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int max = Integer.MIN_VALUE;
	int secmax = Integer.MIN_VALUE;
	int[] arr = {-2,-33,-10,-456};
	for(int i =0;i<arr.length;i++)
	{
	    if(arr[i] > max) 
	    {
		secmax = max;
		max = arr[i];
	    }
	    else  if(arr[i] > secmax && arr[i] != max) secmax = arr[i];
	}
	
	System.out.println(secmax);
    }

}
