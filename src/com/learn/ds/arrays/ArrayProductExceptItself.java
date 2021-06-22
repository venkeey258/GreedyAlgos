package com.learn.ds.arrays;

import java.util.Arrays;

public class ArrayProductExceptItself {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
       int[] arr = {-1,2,-3,4,-5};
       int[] output=new int[arr.length];
       for(int i=0;i< arr.length;i++)
       {
	   int product = 1;
	   for(int j=0;j< arr.length;j++)
	   {
	       if(arr[i] != arr[j])
	       {
		   product *= arr[j];
	       }
	   }
	   output[i] = product;
       }
       
       for(int j=0;j< output.length;j++)
       {
	   System.out.println(output[j]);
       }
    }

}
