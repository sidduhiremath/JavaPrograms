package Coding;

import java.util.Scanner;

public class Prime {
	public static void main(String args[]) {
	int a,f=0;
	 Scanner sc=new Scanner(System.in);
	   a=sc.nextInt();
	 for(int i=2;i<a/2;i++)
	 {
	     if(a%i==0)
	     {
	         f=1;
	         break;
	     }
	 }
	 if (f==0)
		 System.out.println(" %d prime number"+a);
	 else
		 System.out.println("not prime number");
}
}
