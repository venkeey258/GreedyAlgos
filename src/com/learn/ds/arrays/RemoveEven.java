package com.learn.ds.arrays;

import java.util.ArrayList;
import java.util.List;

public class RemoveEven {
    
    public static void main(String[] args) {
	int[] arr = {1,2,4,5,10,6,3};
	List<Integer> output = new ArrayList<Integer>();
	int  i =0;
	while(i < arr.length)
	{
	    if( arr[i] % 2 != 0) output.add(arr[i]);
	    i++;
	}
	
	for(int k: output)
	{
	    System.out.println(k);
	}
    }
}
