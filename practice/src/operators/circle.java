package operators;
import java.util.Scanner;
public class circle {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter radius:");
		float r=s.nextFloat();
		float area = 3.14f*r*r;
		System.out.println("the area of circle is:"+area);
		s.close();
	}
}
