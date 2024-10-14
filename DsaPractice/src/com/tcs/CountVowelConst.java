package com.tcs;


import java.util.Arrays;

public class CountVowelConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Problem Statement: Take your name input, convert the same to the array and the find total vowels and consonants on your name.
         int[] k=getVowelCount("Rajesh");
         int[] m=getVowelCount("Yogita");
		System.out.println("Total vowel in Rajesh is " + Arrays.toString(k));
		System.out.println("Total vowel in Yogita is " + Arrays.toString(m));
	}

//		Output
//		Total vowel in Rajesh is 2
//		Total vowel in Yogita is 3

	

	static int[] getVowelCount(String name) {
//	    write code to count vowels and return
		char[] charArr=name.toCharArray();
		int n=name.length();
		int countVowels=0;
		int countconst=0;
		int[] arr=new int[2];
//		int resultv=0;
//		int resultc=0;
		for(int i=0;i<n;i++) {
			if(charArr[i]=='a'||charArr[i]=='e'||charArr[i]=='i'||charArr[i]=='o'||charArr[i]=='u') {
				countVowels++;
				arr[0]=countVowels;
			}else {
				countconst++;
				arr[1]=countconst;
				
			}
		}
		return arr;
		
	}

}
