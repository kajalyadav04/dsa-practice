package com.lnct;

import java.util.Random;
//generate number between 1 to 100

public class GenerateRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=6;
        int res=generate_Ran_Num(num);
        System.out.println(res);
	}

	private static int generate_Ran_Num(int n) {
		// TODO Auto-generated method stub
		Random numRandom= new Random();
		return numRandom.nextInt(n+1);
	}

}
