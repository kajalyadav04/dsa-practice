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


public static int findSumUsingLogic(String s) {
    // your code here
    int num=0;
    int sum=0;
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        
        if(Character.isDigit(ch)){
            num=num*10+(ch-'0');
            // sum=sum+num;
        }
        else{
              sum=sum+num;
            // if(!ch.equals('')){
                num=0;
            
        }
        
    }
    sum+=num;
    return sum;
}
}
