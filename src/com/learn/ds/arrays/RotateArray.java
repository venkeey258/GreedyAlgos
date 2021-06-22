package com.learn.ds.arrays;

public class RotateArray {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[] arr = {1,2,3,4,5};
	int lst = arr[arr.length-1];
	for(int i = arr.length-1;i>0;i--)
	{
	    arr[i] = arr[i-1];
	}
	arr[0] = lst;
	for(int i:arr)
	{
	    System.out.println(i);
	}
    }

}
