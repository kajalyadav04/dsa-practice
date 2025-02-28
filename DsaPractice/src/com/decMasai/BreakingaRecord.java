package com.decMasai;
import java.util.*;

public class BreakingaRecord{
    
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(n<m){
            System.out.println("Broken");
        }
        else if(n>m){
            System.out.println("Not Yet");
        }
        else{
            System.out.println("Wao");
        }
 }
}