package com.findmissingnumbers;

public class Finding_Missing_Number 
{

	public static void main(String[] args) 
	{
	
		int[] value = {1,2,3,4};
		
		
		
		int sum1 = 0 ;
		
		for (int i = 0 ; i<value.length; i++)
		{
		   sum1 = sum1 +value[i];
		}
		
		System.out.println("sum1 value :"+sum1);
		
		int sum ;
		int sum2 = 0;
		
		for(int j = 1 ;j<=5;j++)
		{
			sum2 =sum2 + j;
		}
		
		System.out.println("sum2 value :"+sum2);
		
		
		System.out.println("missing number :"+(sum2-sum1));
		
		
	}
	
	
	
	
}
