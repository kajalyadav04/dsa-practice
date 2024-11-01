package com.tcs;

public class ArmStrongNum {
	
	public static void main(String[] args) {
		int n=153;
		armstrongCheck(n);
		
		
	}

	private static void armstrongCheck(int n) {
		// TODO Auto-generated method stub
		int count=0;
		int k=n;
		int p=n;
		double sum=0;
		while(k>0) {
//			n=n%10;
			
			k=k/10;
			count++;
		}
		
		while(p>0) {
			
			int rem=p%10;
			double res= Math.pow(rem, count);
		     sum=sum+res;
			p=p/10;
			
		}
		if(n==(int)sum) {
			System.out.println("y");
		}
		else {
			System.out.println("n");
		}
		
	}

}
