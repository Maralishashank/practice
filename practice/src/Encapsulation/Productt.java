package Encapsulation;
class product {
	private String productName;
	private double price;
	product(){
		
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price>0) {
			this.price = price;
		}
		else if(price<0) {
			this.price=0.0;
		}
	}
	public void displayProduct() {
		System.out.println("the product is:"+productName);
		System.out.println("the price is:"+price);
	}
}
public class Productt {
	public static void main(String[] args) {
		product p=new product();
		p.setProductName("laptop");
		p.setPrice(999.00);
		p.displayProduct();
		p.setPrice(-50);
		p.displayProduct();
	}

}
