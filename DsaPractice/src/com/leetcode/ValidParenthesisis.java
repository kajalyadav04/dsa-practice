package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ValidParenthesisis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="()";
	boolean k=	isValid(string);
	System.out.println(k);
		   
	}
	 public static boolean isValid(String s) {
	        if(s.length()%2!=0) return false;
	        Stack<Character> st= new Stack<>();
	        List<Character> lt=new ArrayList<>();
	        lt.add('(');
	        lt.add('{');
	        lt.add('[');

	        for(char ch:s.toCharArray()){
	            if(lt.contains(ch)){
	                st.push(ch);
	            }
	            else if(ch==')'&&!st.isEmpty()&&st.peek()=='('){
	                st.pop();
	            }
	            else if(ch=='}'&&!st.isEmpty()&&st.peek()=='{'){
	                st.pop();
	            }
	             else if(ch==']'&&!st.isEmpty()&&st.peek()=='['){
	                st.pop();
	            }else{
	                return false;
	            }

	        }
	        if(st.isEmpty()){
	            return true;
	        }
	        return false;
	        
	    }
	}



