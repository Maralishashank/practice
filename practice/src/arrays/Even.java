package arrays;
import java.util.Scanner;
public class Even {
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
		System.out.println("the even elements in the array are:");
		for(int i=0;i<val;i++) {
			if(a[i]%2==0)
				System.out.print(a[i]+" ");
		}
s.close();
	}

}
