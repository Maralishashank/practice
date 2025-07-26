package methods;
import java.util.Scanner;
class Rectangle{
	   void rectangle() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter length:");
		int length=s.nextInt();
		System.out.println("enter breadth:");
		int breadth=s.nextInt();
		int area=length*breadth;
		System.out.println("area:"+area);
		s.close();	
	}
}
public class Area_of_rectangle extends Rectangle{
	public static void main(String[] args) {
		Area_of_rectangle a=new Area_of_rectangle();
		a.rectangle();
	}
}


