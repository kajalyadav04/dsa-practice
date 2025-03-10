package com.lnct.tcs;


public class RemoveSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "anjali kum";
	        // your code here
	        StringBuilder k= new StringBuilder();
	        // return s.replaceAll(" ","");
	        for(int i=0;i<s.length();i++){
	            char ch=s.charAt(i);
	            // if(" ".indexOf(ch)!=-1){
	            if(ch==' '){
	                continue;
	                
	            }else{
	                k.append(ch);
	            }
	        }
	        String bKind=k.toString();
	        System.out.println(bKind);
	        
	    }

	

}
