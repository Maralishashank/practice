package conditional;
import java.util.Scanner;
public class maximum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a value:");
		int a=s.nextInt();
		System.out.println("enter b value:");
		int b=s.nextInt();
		System.out.println("enter c value:");
		int c=s.nextInt();
		int val=(a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println("The biggest number is:"+val);
		s.close();
	}
}
