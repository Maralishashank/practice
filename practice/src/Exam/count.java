package Exam;
import java.util.Scanner;
public class count {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int pos=0,neg=0,zero=0;
		String a;
		do {
			System.out.println("enter the num:");
			int n=s.nextInt();
			if(n>0) {
				pos++;
				}
			else if(n<0) {
				neg++;
			}
			else if(n==0) {
				zero++; 
				}
			System.out.println("continue(y/n):");
			a=s.next();
		}
		while(a.equals("y"));
		System.out.println("postive count:"+pos);
		System.out.println("negative count:"+neg);
		System.out.println("zero count:"+zero);	
		s.close();
		}
	}


