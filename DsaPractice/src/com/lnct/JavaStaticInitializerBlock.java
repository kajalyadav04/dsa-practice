package com.lnct;

import java.util.Scanner;

public class JavaStaticInitializerBlock {

	
		// TODO Auto-generated method stub
		public static int H;
	    public static int B;
	    public static int area;
	    static{
	        Scanner sc= new Scanner(System.in);
	        B=sc.nextInt();
	        H=sc.nextInt();
	    }


	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        if(B>0&&H>0){
	            area=B*H;
	            System.out.println(area);
	        }
	        else{
	            System.out.println("java.lang.Exception: Breadth and height must be positive");
	        }
	    

	}

}
