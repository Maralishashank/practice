package inheritance;
class Shape{
	public void draw() {
		System.out.println("draw shape");
	}
}
class circle extends Shape{
	public void draw_Circle() {
		System.out.println("draw circle");
	}
}
public class Shape_circle {
	public static void main(String[] args) {
		circle c=new circle();
		c.draw();
		c.draw_Circle();
	}
}
