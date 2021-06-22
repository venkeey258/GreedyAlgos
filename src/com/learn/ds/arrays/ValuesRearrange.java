package com.learn.ds.arrays;

public class ValuesRearrange {
    
    public static void main(String[] args) {
	int[] arr = {2,4,-6,8,-5,-10};
	int j =0;
	int temp = 0;
	for(int i =0;i<arr.length;i++)
	{
	   if(arr[i] < 0)
	   {
	       if(i != j) {
		   temp = arr[i];
		   arr[i] = arr[j];
		   arr[j] = temp;
	       }
	       j++;
	   }
	}
	 for(int cnt=0;cnt< arr.length;cnt++)
	       {
		   System.out.println(arr[cnt]);
	       }
    }

}
