package arrays;
public class Missing {
	public static void main(String[] args) {
		int arr[]={1,6,2,3,4,5,9,8};
		for(int i=0;i<=9;i++) {
			boolean presnt=check(arr,i);
			if(presnt==false)
				System.out.println("the missing value is:"+i);	
		}
	}
	public static boolean check(int arr[],int i) {		
		for(int j=0;j<arr.length;j++) {
			if(arr[j]==i)
				return true;			
}
		return false;
}
}

