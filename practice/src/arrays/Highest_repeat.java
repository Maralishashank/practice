package arrays;
public class Highest_repeat {
	public static void main(String[] args) {
		int a[]= {1,3,2,1,4,5,2,3,6,7,1,2,3,1};
		int maxcount=0;
		int repeated=a[0];
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count>maxcount) {
				maxcount=count;
				repeated=a[i];	
			}	
		}
		System.out.println("the most repeated element is:"+repeated);
	}

}
