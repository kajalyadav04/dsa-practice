package com.lnct.tcs;

import java.util.Scanner;



public class RemoveBrackets {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in );
		String s= scanner.next();
		String k=removeLogic(s);
		System.out.println(k);
	}
	public static String remove(String f) {
		
//		return f.replaceAll("[(){}[]]", "");
		char[] arr=f.toCharArray();
		String string="";
		for(int i=0;i<f.length();i++) {
			if("(){}[]".indexOf(arr[i])!=-1) {
				continue;
				
			}
			else {
				string+=arr[i];
			}
		}
		
		return string;
	}
	
	public static String removeInbuild(String f) {
//		return f.replaceAll("[\\Q()[]{}\\E]", "");
		return f.replaceAll("[\\[\\]{}()]", "");
		
	}
	public static String removeLogic(String s) {
		StringBuilder kBuilder= new StringBuilder();
		for(char ch:s.toCharArray()) {
			if(ch=='('||ch==')'||ch=='{'||ch=='}'||ch=='['||ch==']') {
				continue;
			}
			else {
				kBuilder.append(ch);
			}
		}
		return kBuilder.toString();
	}
	public static String  removeBracket(String s) {
		char[] arr= s.toCharArray();
		StringBuilder kBuilder=new StringBuilder();
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]=='('||arr[i]==')'||arr[i]=='{'||arr[i]=='}'||arr[i]=='['||arr[i]==']') {
				continue;
			}
			else {
				kBuilder.append(arr[i]);
			}
		}
		
		return kBuilder.toString();
		
	}
}
