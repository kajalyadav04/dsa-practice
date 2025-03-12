package com.lnct.tcs;

public class SumOfNumberInString {
	 // Function to calculate sum of all numbers present in a string.
    public static int findSum(String s) {
        // your code here
        int sum=0;
        String num="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
           
            if(Character.isDigit(ch)){
                num+=ch;
            }else{
                if(!num.equals("")){
                    sum+=Integer.parseInt(num);
                    num="";
                }
                
            }
            
            
            
        }
        if (!num.equals("")) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }

}
