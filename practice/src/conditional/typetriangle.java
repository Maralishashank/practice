package conditional;
import java.util.Scanner;
public class typetriangle {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter s1 value:");
		int s1=s.nextInt();
		System.out.println("enter s2 value:");
		int s2=s.nextInt();
		System.out.println("enter s3 value:");
		int s3=s.nextInt();
		if(s1==s2 && s2==s3) {
			System.out.println("it is a regular triangle");
			}
		else if(s1==s2||s1==s3||s2==s3) {
			System.out.println("it is a symmetric triangle");
		}
		else {
			System.out.println("it is a irregular triangle");
		}
		s.close();
	}
}
