package Encapsulation;
class Rectangle{
	private double length;
	private double breadth;
	Rectangle(){
		
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	public void getArea() {
		double area;
		area=length*breadth;
		System.out.println("the area of rectangle is:"+area);
	}
	public void getPerimeter() {
		double perimeter;
		perimeter=2*(length+breadth);
		System.out.println("the perimeter of rectangle is:"+perimeter);
	}
}
public class Rectangle_area_and_perimeter {
	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.setLength(7);
		r.setBreadth(9);
		r.getArea();
		r.getPerimeter();
	}
}
