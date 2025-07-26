package conditional;
import java.util.Scanner;
public class dispaly {
	public static void main(String[] args) {
	Scanner a =new Scanner(System.in);
	System.out.println("enter m value:");
	int m=a.nextInt(),n=0;
		if(m>0) {
			n=1;
		}
		else if(m==0) {
			n=0;
		}
		else if(m<0) {
			n=-1;
		}
		System.out.println("the value of n is:"+n);
		a.close();
	}

}
