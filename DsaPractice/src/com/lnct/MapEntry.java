package com.lnct;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEntry {

	
		// TODO Auto-generated method stub
		

		    public static int findMaxOccurringElement(int[] arr) {
		    	//Enter code here
		    	
		    	       
		    	            HashMap<Integer,Integer> freq= new HashMap<>();
		    	             for(Integer e:arr){
		    	              freq.put(e,freq.getOrDefault(e,0)+1);
		    	             }
		    	             int maxCount=0;
		    	             int maxElement=-1;
		    	             for(Map.Entry<Integer,Integer> enteries:freq.entrySet()){
		    	                 if(enteries.getValue()>maxCount){
		    	                     maxCount=enteries.getValue();
		    	                     maxElement=enteries.getKey();
		    	                 }
		    	             }
		    	           return maxElement;
		    	        }
		    	        
		    	

		      

		    public static void main(String[] args) {
		        // Example usage
		        int[] arr = {1, 3, 2, 1, 2, 3, 1};
		        int result = findMaxOccurringElement(arr);
		        System.out.println("Maximum occurring element: " + result);
		        
		    }
		    
		


	}


