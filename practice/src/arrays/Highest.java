package arrays;
import java.util.Scanner;
public class Highest {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]={1,4,6,7,8,2};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}	
		}
		System.out.println("enter the kth highest value u want:");
		int va=s.nextInt();
		System.out.println("the "+va+" highest value is:"+a[a.length-va]);
		s.close();
	}
}
