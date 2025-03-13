package com.lnct.tcs;

import java.util.Scanner;

public class CaptilizeTheTitle {
	public static void main (String Args[]) {
		Scanner sc= new Scanner(System.in);
		String s="i can definitly do it";
		String kString= capFn(s);
		System.out.println(kString);
	}

	private static String capFn(String s) {
		StringBuilder kBuilder= new StringBuilder();
		s.toLowerCase();
		String[] words= s.split(" ");
		for(int i=0;i<words.length;i++) {
			if(words[i].length()<=2) {
				words[i].toLowerCase();
				kBuilder.append(words[i]+" ");
			}
			else {
			char chi=	 words[i].charAt(0);
			Character ch= Character.toUpperCase(chi);
			String kString=ch+words[i].substring(1);
			kBuilder.append(kString+" ");
			}
			
		}
//		for(int i=0;i<words.length;i++) {
//			kBuilder.append(words[i]+" ");
//		}
//		
				
		return kBuilder.toString().trim();
		// TODO Auto-generated method stub
		
	}

}
