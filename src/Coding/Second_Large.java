package Coding;

import java.util.Arrays;

public class Second_Large {
	public static void main(String args[]){  
	//using inbuilt method	
		int b[]={44,66,99,77,33,22,55};
		Arrays.sort(b);
		int length=b.length;
		System.out.println("Second Largest: " +b[length-2]);  	
	
	//Without inbuilt method
			int temp;  
			int total=b.length;;
			for (int i = 0; i < total; i++)   
			        {  
			            for (int j = i + 1; j < total; j++)   
			            {  
			                if (b[i] > b[j])   
			                {  
			                    temp = b[i];  
			                    b[i] = b[j];  
			                    b[j] = temp;  
			                }  
			            }  
			        }
			System.out.println("Second Largest Number "+b[total-2]);
					}
	}  


