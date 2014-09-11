package se.sollfjord.codility;

import java.util.Arrays;
import java.math.BigInteger;

public class PermMissingElem {

	//simple version
    public int solution(int[] A) {
        
        long sum = Arrays.stream(A).sum();
        
        int n = A.length+1;
        long sumPerm = (n*(n+1))/2;
        
        return (int) (sumPerm - sum);
    }
    
    //should be used to avoid overflow due too large sums   
    public int bigIntegerSolution(int[] A) {

        BigInteger[] B = new BigInteger[A.length];
        BigInteger sum = BigInteger.ZERO;
        
        BigInteger N = new BigInteger(A.length+1+"");
        
        for(int i = 0; i < A.length; i++)
        {
            B[i] = new BigInteger(A[i]+"");
            sum = sum.add(B[i]);
            
        }
            
    BigInteger sumPerm = N.multiply(N.add(BigInteger.ONE)).divide(new BigInteger("2"));  
            
    return sumPerm.subtract(sum).intValue();
        
    }

}
