package Coding;

import java.util.Scanner;

public class SimpleSort {

	public static void main(String[] args) {
		int a[]=new int[10];
		int i,n,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		   n=sc.nextInt();
		   System.out.println("enter numbers/n");
		   for(i=0;i<n;i++)
			   a[i]=sc.nextInt();
		   System.out.println("numbers are\n");
		for(i=0;i<n;i++)
			System.out.println(" "+a[i]);
		for (i=0;i<n;i++)
		{
		    for(int j=0;j<n-i-1;j++)
		    if(a[j]>a[j+1])
		    {
		        t=a[j];
		        a[j]=a[j+1];
		        a[j+1]=t;
		    }
		}
		System.out.println("numbers after ascending are\n");
		for(i=0;i<n;i++)
			System.out.println(" "+a[i]);
	}

}
