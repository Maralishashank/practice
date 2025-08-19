package arrays;
import java.util.Scanner;
public class Prime_number {
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
		System.out.println("the prime numbers in the array:");	
		for(int i=0;i<a.length;i++) {
            int count=0;
			for(int k=1;k<=a[i];k++) {
				if(a[i]%k==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.print(a[i]+" ");
			}
		}
		s.close();
	}

}
