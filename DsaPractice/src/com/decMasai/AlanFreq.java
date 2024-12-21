package com.decMasai;
import java.util.*;
public class AlanFreq{
    public static void alanFreq(int n,String s){
        Map<Character,Integer> alanMap = new HashMap<>();
        char[] charArr=s.toCharArray();
        for(char ch:charArr){
            if(alanMap.containsKey(ch))
            alanMap.put(ch,alanMap.get(ch)+1);
            else
            alanMap.put(ch,1);
        }
        for(Map.Entry<Character,Integer> e:alanMap.entrySet()){
            System.out.println(e.getKey()+"-"+e.getValue());
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        alanFreq(n,s);
    }
    
}
