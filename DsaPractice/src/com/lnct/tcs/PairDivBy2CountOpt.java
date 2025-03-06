package com.lnct.tcs;

import java.util.Scanner;

public class PairDivBy2CountOpt {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            // Your code goes here
               int n = scanner.nextInt(); // Size of array
               int[] arr = new int[n]; // Correctly initialize array

               for (int i = 0; i < n; i++) {
                 arr[i] = scanner.nextInt(); // Read array elements
               }
              long res= pairCount(arr,n);
              System.out.println(res);

        }
    }
    public static long  pairCount( int[] arr,int n){
         long counteven=0;
         long countodd=0;
        for (int i = 0; i < n; i++) {
        	if(arr[i]%2==0) {
        		counteven++;
        	}
        	else {
        		countodd++;
        	}
        }
        long totalPairs=counteven*(counteven-1)/2+countodd*(countodd-1)/2;
       return totalPairs;
    
    
}

}
