package com.lnct.tcs;



public class RemoveCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="\"$Gee*k;s..fo, r'Ge^eks?\"";
	
	}
	public static String removeSpecialCharacter(String s) {
        // code here
        String k=s.replaceAll("[^A-Za-z]","");
        if(k.length()==0){
            return "-1";
        }
        else{
           return k;
        }
    }
	public static String removeSpecialChracterLogic(String s) {
		 char[] arr=s.toCharArray();
			StringBuilder str= new StringBuilder();
			for(int i=0;i<arr.length;i++) {
				if ((arr[i]>='a'&&arr[i]<='z')||(arr[i]>='A'&&arr[i]<='Z') ){
					str.append(arr[i]);
					
				}
			}
			if(str.length()==0){
			    return "-1";
			}
			return str.toString();
			
		
	}
	public static String removeSpecialCharacterUsingStringFn(String s) {
	        // code here
	        char[] arr=s.toCharArray();
	        int j=0;
	        for(int i=0;i<arr.length;i++){
	            if((arr[i]>='a'&&arr[i]<='z')||(arr[i]>='A'&&arr[i]<='Z')){
	                arr[j]=arr[i];
	                j++;
	            }
	        }
	       
	        String k=String.valueOf(arr).substring(0,j);
	        if(k.length()==0){
	            return "-1";
	        }
	        return k;
			
		}

}
