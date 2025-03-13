package com.lnct.tcs;

public class CaptilizeFirstAndLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="anjali";
		String kString= capitilize(str);
		System.out.println(kString);

	}

	private static String capFn(String str) {
		// TODO Auto-generated method 
		
		int len=str.length();
		if(len==0||str==null) {
			return str;
		}
		else if(len==1) {
			return str.toUpperCase();
		}
		
		return Character.toUpperCase(str.charAt(0))+str.substring(1,len-1)+Character.toUpperCase(str.charAt(len-1));
	}
	public static  String capitilize(String s) {
		int len=s.length();
		return s.substring(0,1).toUpperCase()+s.substring(1,len-1)+s.substring(len-1).toUpperCase();
	}

}
