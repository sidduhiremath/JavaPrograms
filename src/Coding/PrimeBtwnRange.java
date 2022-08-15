package Coding;

import java.util.Scanner;

public class PrimeBtwnRange {

	public static void main(String[] args) {
		int l,h,f;
		 System.out.println("enter intervals");
	    Scanner sc=new Scanner(System.in);
		   l=sc.nextInt();
		   h=sc.nextInt();
	    while(l<h)
	    {
	        f=1;
	        for(int i=2;i<=h/2;i++){
	            if(l%i==0)
	        {
	            f=0;
	            //continue;
	        }
	        }
	        if(f!=0)
	        	 System.out.println("   "+l);
	            ++l;
	}

}}
