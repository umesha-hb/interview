package com.uttara.cognizant;



public class PrintArrayZeroAtTheEnd {

	public static void main(String[] args) {
		int arr[] = {1,0,0,5,3,4,0};
		int count=0;
		int j=0;
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i]==0)
			{
				count++;
			}else
			{
				arr[j++]=arr[i];
			}
		}
		while(count>0)
		{
			arr[j++]=0;
			count--;
		}
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	

		
	}
	

}
