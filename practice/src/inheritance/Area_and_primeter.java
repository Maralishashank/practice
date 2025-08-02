package inheritance;
class Rectangle{
	int length;
	int breadth;
	Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
}
class Area extends Rectangle{
	int area;
	Area(){
		super(7,9);
		area=length*breadth;
	}
	public void display() {
		System.out.println("the area of rectangle is:"+area);
	}
}
public class Area_and_primeter {
	public static void main(String[] args) {
		Area a=new Area();
		a.display();
	}
}
