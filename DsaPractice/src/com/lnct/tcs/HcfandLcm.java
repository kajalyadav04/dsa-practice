package com.lnct.tcs;

public class HcfandLcm {
public static int[] lcmAndGcd(int a, int b) {
        
        // code here
        int[] arr=new int[2];
        int one1=a;
        int  one2=b;
        while(a%b!=0){
           int  rem=a%b;
            a=b;
            b=rem;
           
            
        }
        int gcd=b;
        int lcm=(one1*one2)/gcd;
         arr[0]=lcm;
         arr[1]=gcd;
         return arr;
    }
public static int[] lcmAndGcdUsingAnother(int a, int b) {
    
    // code here
    int[] arr=new int[2];
    int one1=a;
    int  one2=b;
    while(b!=0){
       int t=b;
       b=a%b;
       a=t;
        
    }
    int gcd=a;
    int lcm=(one1*one2)/gcd;
     arr[0]=lcm;
     arr[1]=gcd;
     return arr;
}

}
