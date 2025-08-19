package arrays;
public class dupli {
	public static void main(String[] args) {
		int a[]={2,3,4,1,2,5,6,7,2,3};
		int count=0;
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			boolean c=false;
			for(int j=0;j<count;j++) {
				if(a[i]==b[j]) {
					c=true;
					break;
				}
			}
			if(!c)
				b[count++]=a[i];
		}
		for(int i=0;i<count;i++) {
			System.out.print(b[i]+" ");
		}
	}
}
