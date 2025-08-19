package arrays;
import java.util.Scanner;
public class Sum {
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
		int sum=0;
		for(int i=0;i<val;i++) {
			sum+=a[i];
		}
     System.out.println("sum of array elements is:"+sum);
     s.close();
	}
}
