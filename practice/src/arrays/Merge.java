package arrays;
import java.util.Scanner;
public class Merge {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of elements in array a:");
		int val=s.nextInt();
		int a[]=new int[val];
		for(int j=0;j<a.length;j++) {
			System.out.println("enter the value:");
			int b=s.nextInt();
			a[j]=b;
		}
		System.out.println("enter the number of elements in array b:");
		int val1=s.nextInt();
		int b[]=new int[val1];
		for(int j=0;j<a.length;j++) {
			System.out.println("enter the value:");
			int g=s.nextInt();
			b[j]=g;
		}
		System.out.println("the merge elements of both arrays:");
		int c[]=new int[a.length+b.length];
		for(int k=0;k<a.length;k++) {
			c[k]=a[k];
		}
		for(int k=a.length,i=0;k<c.length;k++,i++) {
			c[k]=b[i];
		}
		for(int i=0;i<c.length;i++) {
		System.out.print(c[i]+" ");
		}
		s.close();
	}

}
