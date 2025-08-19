package arrays;
import java.util.Scanner;
public class Duplicates {
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
		int b[]=new int[a.length];
		int count=0;
		for(int i=0;i<a.length;i++) {
			boolean c=false;
			for(int j=0;j<count;j++) {
				if(a[i]==a[j]) {
					c=true;
					break;
				}
			}
			if(!c)
				b[count++]=a[i];
		}
		for(int k=0;k<count;k++) {
			System.out.println(b[k]+" ");	
		}
		s.close();
	}
}
