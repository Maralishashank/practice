package polymorphism;
public class Calculator {
	int val;
	public int multiply(int a,int b) {
		val=a*b;
		return val;
	}
	public int multiply(int a,int b,int c) {
		val=a*b*c;
		return val;
	}
	public double multiply(double a,int b) {
		double value;
		value=a*b;
		return value;
	}
	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println("multiply of 2 integers:"+c.multiply(6,7));
		System.out.println("multiply of 3 integers:"+c.multiply(6,7,9));
		System.out.println("multiply of a double and a integers:"+c.multiply(4d,7));
	}

}
