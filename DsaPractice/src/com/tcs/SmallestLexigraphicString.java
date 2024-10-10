package com.tcs;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SmallestLexigraphicString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		int test=scanner.nextInt();
//		for(int i=0;i<test;i++) {
			String string="qwertyuiopasdfghjklzxcvbnm";
			String strToFind= "plmko";
//			lexifn(string,strToFind);
			lexigraphicfn(string,strToFind);
			
		}

	

	private static void lexigraphicfn(String string, String strToFind) {
		// TODO Auto-generated method stub
		Set<Character> characters = new TreeSet<>();
		for(char ch:string.toCharArray()) {
			characters.add(ch);
		}
		for(char ch:strToFind.toCharArray()) {
			if(characters.contains(ch)) {
				System.out.print(ch);
			}
		}
		
	}



	private static void lexifn(String string, String strToFind) {
		// TODO Auto-generated method stub
		int n=string.length();
		char[] charArr=string.toCharArray();
		char[] chArr=strToFind.toCharArray();
		for(int i=0;i<n;i++) {
			for(int j=0;j<strToFind.length();j++) {
				if(charArr[i]==chArr[j]) {
//					System.out.println(charArr[i]);
					System.out.print(chArr[j]+"");
//					System.out.println(chArr[j]);
					
				}
			}
		}
		
	}

}
