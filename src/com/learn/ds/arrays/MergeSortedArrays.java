package com.learn.ds.arrays;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedArrays {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int arr1[] = {1,3,4,5};
	int arr2[] = {2,4,6,8};
	
	
	int[] output = new int[arr1.length+arr2.length];
	
	int i= 0,j=0,k=0;;
	while(i < arr1.length && j <arr2.length)
	{
	    if(arr1[i] <= arr2[j])
	    {
		output[k] = arr1[i];
		i++;
		k++;
	    }
	    else
	    {
		output[k] = arr2[j];
		j++;k++;
	    }
	    
	   }
	  while(i < arr1.length)
	  {
	      output[k] = arr1[i];
		i++;
		k++;
	  }
	  while(j < arr2.length)
	  {
	      output[k] = arr2[j];
		j++;
		k++;
	  }
	 for(int cnt =0;cnt<output.length;cnt++)
	 {
	     System.out.println(output[cnt]);
	 }
	
		
	
    }

}
