package Coding;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int n,c=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		n=sc.nextInt();
	  for(int i=1;i<=n;i++)
	  {
	      c=c*i;
	  }
	  System.out.println("factorial of "+n+" is "+c);
	}

}
