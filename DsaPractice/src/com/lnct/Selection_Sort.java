package com.lnct;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=	{17,45,23,51,13};
int n=arr.length;
for(int i=0;i<=n-1;i++) {
	int mid=i;
	for(int j=i+1;j<n;j++) {
		if(arr[mid]>arr[j]) {
			mid=j;
		}
	}
		int temp=arr[mid];
		arr[mid]=arr[i];
		arr[i]=temp;
	}
for(int num:arr) {
	System.out.print(num+" ");
	}
}
}