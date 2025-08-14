package abstraction;
import java.util.UUID;
abstract class Payment{
	int amount;
	public abstract void initiatePayment(int amount);
	public abstract void veifyPayment();
	public String generateTransactionId() {
		return UUID.randomUUID().toString();
	}	
}
class CreditCardPayment extends Payment{
	public void initiatePayment(int amount) {
		System.out.println("the credit card payment initiated:"+amount);
	}
	public  void veifyPayment() {
		System.out.println("the credit card payment is verifiyed");
		System.out.println("random transaction Id:"+generateTransactionId());
	}
}
class UPIPayment extends Payment{
	public void initiatePayment(int amount) {
		System.out.println("the UPI payment initiated:"+amount);
	}
	public  void veifyPayment() {
		System.out.println("the UPI payment is verifiyed");
		System.out.println("random transaction Id:"+generateTransactionId());
	}
}
class NetBankingPaymet extends Payment{
	public void initiatePayment(int amount) {
		System.out.println("the NetBankingPaymet initiated:"+amount);
	}
	public  void veifyPayment() {
		System.out.println("the NetBankingPaymet is verifiyed");
		System.out.println("random transaction Id:"+generateTransactionId());
	}
}
public class Payments {
	public static void main(String[] args) {
		Payment p=new CreditCardPayment();
		p.initiatePayment(500);
		p.veifyPayment();
		Payment p1=new UPIPayment ();
		p1.initiatePayment(600);
		p1.veifyPayment();
		Payment p2=new NetBankingPaymet();
		p2.initiatePayment(200);
		p2.veifyPayment();
	}

}
