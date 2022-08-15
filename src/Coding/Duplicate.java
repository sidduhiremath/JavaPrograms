package Coding;

public class Duplicate {

	public static void main(String[] args) {
		int a[]= {1,2,4,5,2};
		int b[]= new int[a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					b[i]=a[i];
				}
			}
		}
		for(int i=0;i<b.length;i++) {
			if(b[i]!=0)
			System.out.println(b[i]);
		}
		
	}

}
