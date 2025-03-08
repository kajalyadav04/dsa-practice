package com.lnct.tcs;

public class HcfAndLcmRecursion {
public static int[] lcmAndGcd(int a, int b) {
        
        // code here
        // 
        int gcd=gcdFn(a,b);
        int lcm=(a*b)/gcd;
        return new int[]{lcm,gcd};
    }
    private static int gcdFn(int a,int b){
        if(b==0){
            return a;
            
        }
        return gcdFn(b,a%b);
    }

}
