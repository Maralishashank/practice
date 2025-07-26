package conditional;
import java.util.Scanner;
public class alphabet {
	public static void main(String[] args) {
		Scanner c=new Scanner(System.in);
		System.out.println("enter the char:");
		char ch=c.next().charAt(0);
		if( ch =='a' || ch =='e' || ch=='i' || ch=='o'||ch=='u') {
			System.out.println("The given alphabet "+ch+" is vowel");
		}
		else {
			System.out.println("The given alphabet "+ch+" is constant");
		}
		c.close();

	}

}
