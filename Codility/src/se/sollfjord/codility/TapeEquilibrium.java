package se.sollfjord.codility;

import java.util.*;

public class TapeEquilibrium {
	
	    public int solution(int[] A) {
	        
	        int top = A[0];
	        int bottom = Arrays.stream(A).sum() - A[0];
	        int diff = Math.abs(top - bottom);
	        
	        int minimum = diff;
	        
	        for(int i=1; i < A.length-1; i++)
	        {
	            top += A[i];
	            bottom -= A[i];
	            diff = Math.abs(top - bottom);
	            //System.out.println(diff);
	            
	            if(diff < minimum)
	            minimum = diff;
	        }
	        
	        return minimum;
	    }

}
