package Exam;
import java.util.Scanner;
public class reverse {
	int rev=0,digit=0,count=0,orgi;
	public void reversenum() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=s.nextInt();
		while(n!=0) {
			digit=n%10;
			count++;
			rev=rev*10+digit;
			n/=10;
		}
		System.out.println("reverse:"+rev);
		s.close();
	}
	public void armstrong() {
		int orgi=rev,sum=0,temp=rev;
		while(temp>0) {
			int a=temp%10;
			sum+=Math.pow(a,count);
			temp/=10;	
		}
		if(sum==orgi) {
			System.out.println("it is a armstrong");
	}
		else {
			System.out.println("it is not a armstrong");
		}
	}
	public void strongnum() {
		 int temp2=rev,mul=0;
		  while(temp2>0) {
			  int b=temp2%10;
			  int fact=1;
			  for(int i=1;i<=b;i++) {
				  fact*=i;
			  }
			  mul+=fact;
			  temp2/=10;  
		  }
		  if(mul==orgi) {
			  System.out.println("it is a strong number");
		  }
		  else {
			  System.out.println("it is not a strong number");
		  }	
	}
	public void ducknum() {
		int temp3=rev,count1=0;
		while(temp3>0) {
			int d=temp3%10;
			if(d==0) {
				count1++;
			}
			temp3/=10;
		}
		if(count1>0) {
			System.out.println("it is a duck number");
		}
		else {
			System.out.println("it is not a duck number");
		}
		}
	public static void main(String[] args) {
		reverse r=new reverse();
		r.reversenum();
		r.armstrong();
		r.strongnum();
		r.ducknum();
	}
}
