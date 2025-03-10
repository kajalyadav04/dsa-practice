package com.lnct.tcs;

import java.util.Scanner;

public class RemoveBrackets {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in );
		String s= scanner.next();
		String k=removeInbuild(s);
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
}
