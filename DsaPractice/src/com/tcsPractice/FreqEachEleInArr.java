package com.tcsPractice;

import java.util.Scanner;

public class FreqEachEleInArr{

		public static void main(String[] args){
		    Scanner sc= new Scanner(System.in);
		    int n=sc.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		   Map<Integer,Integer> map=freq(arr);
		   for(Map.Entry<Integer,Integer> entry:map.entrySet()){
		       System.out.println(entry.getKey()+"k "+entry.getValue());
		   }
		  
		}
		public static Map freq(int[] arr){
		    Map<Integer,Integer> map=new HashMap<>();
		    for(int i=0;i<arr.length;i++){
		        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		    }
		   // for(Map.Entry<Integer,Integer> entry:map.entrySet()){
		   //     System.out.println(entry.getKey()+" "+entry.getValue());
		        
		   // }
		    
		    return map;
		    
		}

	
}
