package com.leetcode;

public class MergeTwoArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Definition for singly-linked list.
		 * public class ListNode {
		 *     int val;
		 *     ListNode next;
		 *     ListNode() {}
		 *     ListNode(int val) { this.val = val; }
		 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		 *     
		 * }
		 */
		ListNode list1= new ListNode(2);
		ListNode list2= new ListNode(3);
		ListNode a1= mergeTwoLists( list1, list2);
		System.out.println(a1.toString());
		
		
	}
		
		    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		        ListNode dummy = new ListNode(0);
		        ListNode curr = dummy;
		        while(list1!=null && list2!=null){
		            if(list1.val<=list2.val){
		                curr.next=list1;
		                list1=list1.next;
		            }else{
		                curr.next=list2;
		                list2=list2.next;
		            }
		            curr=curr.next;

		        }
		        curr.next=list1==null?list2:list1;

		        return dummy.next;
		    }
		}
		

	


