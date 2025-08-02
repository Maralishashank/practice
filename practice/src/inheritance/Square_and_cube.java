package inheritance;
class MathUtility{
	MathUtility(){

	}
	public static void square(int a) {
		double b=Math.pow(a, 2);
		System.out.println("the square of "+a+" is: "+b);
	}
}
class Caluculator extends MathUtility{
	public static void cube(int a) {
		double b=Math.pow(a, 3);
		System.out.println("the cube of "+a+" is: "+b);
	}	
}
public class Square_and_cube {
	public static void main(String[] args) {
		Caluculator.square(4);
		Caluculator.cube(4);
		}
}
