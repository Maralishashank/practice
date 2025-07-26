package control_statements;
import java.util.Scanner;
public class Fibonachi {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter N value:");
		int n=s.nextInt(),n1=0,n2=1,n3=0;
		System.out.println("fibonacci sequence:");
		for(int i=1;i<=n;i++) {
			System.out.print(n1+" ");
		    n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		s.close();
	}

}
