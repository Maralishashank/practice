package control_statements;
import java.util.Scanner;
public class caluculator {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter 1st num:");
		int a=s.nextInt();
		System.out.println("enter 2nd num:");
		int b=s.nextInt();
		System.out.println("enter operation:");
		char operation=s.next().charAt(0);
		switch(operation) {
		case '+' :
			System.out.println("addition:"+(a+b));
			break;
		case '-':
			System.out.println("subtraction:"+(a-b));
			break;
		case 3:
			System.out.println("multiplication:"+(a*b));
			break;
		case '/':
			System.out.println("divison:"+(a/b));
			break;
		case '%':
			System.out.println("modulus:"+(a%b));
			break;
		default:
			System.out.println("Enter valid operation");	
		}
		s.close();
	}
}
