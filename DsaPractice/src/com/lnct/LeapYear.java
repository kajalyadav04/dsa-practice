package com.lnct;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 200;

		boolean res = leapYrCheck(n);
		System.out.println(res);

	}

	private static boolean leapYrCheck(int n) {
		// TODO Auto-generated method stub
//		boolean flag = false;
		if (n % 4 == 0) {
			if (n % 100 == 0) {
				if (n % 400 == 0) {
//					
                 return true;
				}
				return false;
			}

			return true;
		}
		return false;
		

	}

}
