package inheritance;
class Shape1{
	public void draw() {
		System.out.println("the shape is drawn");
	}
}
class Circle1 extends Shape1{
	public void drawCircle() {
		System.out.println("the circle is drawn");
	}
}
class ColoredCircle extends Circle1{
	public void setColor(String color) {
		System.out.println("the circle color is "+color);
	}
}
public class Shape_circle_colour {
	public static void main(String[] args) {
		ColoredCircle c=new ColoredCircle();
		c.draw();
		c.drawCircle();
		c.setColor("blue");
	}
}
