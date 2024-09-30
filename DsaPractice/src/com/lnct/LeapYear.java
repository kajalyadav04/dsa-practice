package com.lnct;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;

		boolean res = leapYrCheck(n);
		System.out.println(res);

	}

	private static boolean leapYrCheck(int n) {
		// TODO Auto-generated method stub
		boolean flag = false;
		if (n % 4 == 0) {
			if (n % 100 == 0) {
				if (n % 400 == 0) {
				
                 flag= true;
				}
				 
			}
//			else {
				flag=true;
//			}

			
		}
		return flag;
		

	}

}
