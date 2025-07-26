package control_statements;
public class Armstrong {
	public static void main(String[] args) {
		System.out.println("The armstrong number between 1 to 1000:");
		for(int n=1;n<=1000;n++) {
		int orgi=n;
		int temp=n,digit=0;
		while(temp>0) {
			digit++;
			temp/=10;
		}
		int sum=0,temp2=n;
		while(temp2>0) {
			int a=temp2%10;
			sum+=Math.pow(a,digit);
			temp2/=10;
		}
		if(sum==orgi) {
			System.out.println(+orgi);
		}
	}
	}
}
