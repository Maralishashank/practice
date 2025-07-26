package conditional;
import java.util.Scanner;
public class profit_or_loss {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter selling_price:");
		long selling_price=s.nextInt();
		System.out.println("enter cost_price:");
		long cost_price=s.nextInt();
		if(selling_price>cost_price) {
			System.out.println("The profit is "+(selling_price-cost_price)+"$");
		}
		else if(selling_price<cost_price) {
			System.out.println("The loss is "+(cost_price-selling_price)+"$");
		}
		s.close();
	}
}
