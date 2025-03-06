package com.lnct.tcs;

import java.util.Scanner;

public class PairDivBy2Count {
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
              int res= pairCount(arr,n);
              System.out.println(res);

        }
    }
    public static int pairCount( int[] arr,int n){
        
       int count=0;
       for (int i = 0; i < n; i++) {
               for (int j = i + 1; j < n; j++) {
                   if ((arr[i] + arr[j]) % 2 == 0) { // Check divisibility by 2
                       count++;
                   }
               }
       }
       return count;
    }
        
    

}
