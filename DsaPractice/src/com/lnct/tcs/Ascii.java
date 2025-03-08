package com.lnct.tcs;

import java.util.Scanner;

public class Ascii {
	
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	char ch=sc.next().charAt(0);
	
	int res=ascifn(ch);
	System.out.println(res);
}

private static int ascifn(char ch) {
	// TODO Auto-generated method stub
	int res=(int)ch;
	return res;
}
}
