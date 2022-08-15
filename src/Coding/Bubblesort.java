package Coding;

import java.util.Scanner;

public class Bubblesort {

	public static void main(String[] args) {
		int i,j,n;
		   System.out.println("enter total numbers");
		   Scanner sc=new Scanner(System.in);
		   n=sc.nextInt();
		   int a[] = new int[n];
		   System.out.println("enter numbers");
		   for(i=0;i<n;i++)
		   a[i]=sc.nextInt();
		   for(i=0;i<n;i++)
		    for(j=0;j<n-i;j++)
		    if(a[j]>a[j+1])
		   {
		       int t=a[j];
		       a[j]=a[j+1];
		       a[j+1]=t;
		   }
		   System.out.println("the array in ascending order");
		   for(i=0;i<n;i++)
			   System.out.println(" "+a[i]);

		   sc.close();
	}
	

}
