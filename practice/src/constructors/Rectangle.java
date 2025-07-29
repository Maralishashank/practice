package constructors;
public class Rectangle {
	private int length;
	private int breadth;
	Rectangle(int a,int b){
		length=a;
		breadth=b;
	}
	public void calculateArea() {
		int area=length*breadth;
		System.out.println("area:"+area);	
	}
	public static void main(String[] args) {
		Rectangle r=new Rectangle(7,5);
		r.calculateArea();
	}
}
