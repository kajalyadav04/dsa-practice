package com.lnct;

import java.util.Random;

public class GenerateRandomNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random random =new Random();
for(int i=1;i<=5;i++){
	System.out.println(random.nextInt(100));
}
}

}
