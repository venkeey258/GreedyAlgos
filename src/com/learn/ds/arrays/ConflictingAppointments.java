package com.learn.ds.arrays;

import java.util.Arrays;

public class ConflictingAppointments {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		Interval[] intervals = { new Interval(6,7),
						  new Interval(2,4),
						  new Interval(8,12)
						 };
		boolean result = canAttendAllAppointments(intervals);
		System.out.println(result);
    }

    private static boolean canAttendAllAppointments(Interval[] intervals) {
	// TODO Auto-generated method stub
	Arrays.sort(intervals, (a,b) -> Integer.compare(a.start,b.start));
	for(int i =1;i<intervals.length;i++)
	{
	    if(intervals[i].start < intervals[i-1].end)
	    {
		return false;
		
	    }
	}
	return true;
    }

}

class Interval{
    
    int start;
    int end;
    
    public Interval(int start, int end) {
	this.start = start;
	this.end = end;
    }
    
    
    
    
}
