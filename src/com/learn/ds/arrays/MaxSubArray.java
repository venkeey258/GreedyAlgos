package com.learn.ds.arrays;

public class MaxSubArray {
    
    public static void main(String[] args) {
	
	 int[] arr = {1,7,-2,-5,10,-1};
	    
	    int result = MaxSubArray(arr,0,arr.length-1);
	    System.out.println(result);
	
    }
    
  static int MaxSubArray(int[] arr, int start, int end) {
	// TODO Auto-generated method stub
	if(start == end) return arr[start];
	 int mid = (start+end)/2;
	 
	 return Math.max(Math.max(MaxSubArray(arr,start,mid), 
		 				    MaxSubArray(arr,mid+1,end)), 
		 				    MaxCrossingArray(arr,start,mid,end));	
    }

    static int MaxCrossingArray(int[] arr, int start, int mid, int end) {
	// TODO Auto-generated method stub
	 int left_sum = Integer.MIN_VALUE;
	 int right_sum = Integer.MIN_VALUE;
	int sum = 0;
	 for(int i = mid;i>=start;i--)
	 {
	     sum = sum+ arr[i];
	     if(sum > left_sum ) left_sum = sum;
	     
	 }
	 sum = 0;
	 for(int j = mid+1;j<=end;j++)
	 {
	     sum = sum+ arr[j];
	     if(sum > right_sum ) right_sum = sum;
	     
	 }
	return left_sum+right_sum;
    }

}
