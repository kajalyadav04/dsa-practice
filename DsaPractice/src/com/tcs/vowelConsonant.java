package com.tcs;

import java.util.Scanner;

public class vowelConsonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int[] k=count( s);
		System.out.println("vowel"+k[0]);
		System.out.println("cowel"+k[1]);
		System.out.println("sowel"+k[2]);
	}
	public static int[] count(String s) {
		int[] arr = new int[3];
		
		int v=0;
		int c=0;
		int sp=0;
		for(int i=s.length()-1;i>=0;i--){
		    char ch=s.charAt(i);
		    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
		        v++;
		    }
		    else if(Character.isLetter(ch)){
		        c++;
		    }
		    else if(ch==' '){
		        sp++;
		    }
		}
		arr[0]=v;
		arr[1]=c;
		arr[2]=sp;
		return arr;
		
	}
	}


