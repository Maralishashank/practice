package arrays;
import java.util.Scanner;
public class Reverse {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of elements in array:");
		int val=s.nextInt();
		int a[]=new int[val];
		for(int j=0;j<a.length;j++) {
			System.out.println("enter the value:");
			int b=s.nextInt();
			a[j]=b;
		}
		System.out.println("the reverse of array is:");
		int rev[]=new int[a.length];
		for(int k=0,i=a.length-1;k<rev.length;k++,i--) {
			rev[k]=a[i];
			System.out.print(rev[k]+" ");
		}
		s.close();
	}
}
