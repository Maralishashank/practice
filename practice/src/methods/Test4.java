package methods;
public class Test4 {
	static int i=1;
	public static void main(String[] args) {
		//static int i=1 -> cannot modified the i value
		for(Test4.i = 1; Test4.i < 10; Test4.i++) {
			i=i+2;
			System.out.print(i+" ");
		}
	}
}
