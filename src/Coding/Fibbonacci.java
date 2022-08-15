package Coding;

import java.util.Scanner;

public class Fibbonacci {
 public static void main(String arge[]) {
	 int n,a=0,b=1,c,i;
	 Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		n=sc.nextInt();
		System.out.println("series has "+a+" "+b);
	    for(i=2;i<n;i++)
	    {
	        c=a+b;
	        System.out.println(" "+c);
	        a=b;
	        b=c;
	    }

 }
}
