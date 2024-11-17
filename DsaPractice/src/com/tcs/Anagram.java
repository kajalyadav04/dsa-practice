package com.tcs;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
public static void main(String[] args) {
	    
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String r=sc.nextLine();
        if(anagram(s,r)){
            System.out.println("y");
        }
        else{
            System.out.println("n");
        }
        }
	
	public static boolean anagram(String str1,String str2) {
	    String s=str1.replaceAll("\\s","");
	    String r=str2.replaceAll("\\s","");
	    char[] arr1=s.toCharArray();
	    char[] arr2=r.toCharArray();
	    Arrays.sort(arr1);
	    Arrays.sort(arr2);
	    return Arrays.equals(arr1,arr2);
	}

}
