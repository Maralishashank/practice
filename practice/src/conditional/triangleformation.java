package conditional;
import java.util.Scanner;
public class triangleformation {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a angle:");
		int a=s.nextInt();
		System.out.println("enter b angle:");
		int b=s.nextInt();
		System.out.println("enter c angle:");
		int c=s.nextInt();
		int val=a+b+c;
		if(val==180) {
			System.out.println("the triangle can be formed with given angles");
		}
		else {
			System.out.println("the triangles can't be formed with given angles");
		}
		s.close();
	}
}
