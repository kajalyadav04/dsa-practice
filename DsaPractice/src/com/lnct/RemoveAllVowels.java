package com.lnct;

import java.util.Scanner;

public class RemoveAllVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner= new Scanner(System.in);
		String string="geeksforgeeksyou";
		Remove(string);

	}

	private static void Remove(String string) {
		// TODO Auto-generated method stub
		String string2="";
		for(char ch:string.toCharArray()) {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				continue;
			}
			else {
			string2+=ch;	
			}
		}
		System.out.println(string2);
	}

}
