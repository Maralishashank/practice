package Exam;
import java.util.Scanner;
public class game {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the coins:");
		int coins_earned=s.nextInt();
		int level1=1000,level2=2000,level3=3000;
		if(coins_earned>=level1) {
			System.out.println("cleared level 1");
			System.out.println("moved to next level");
			if(coins_earned>=level2) {
				System.out.println("cleared level 2");
				System.out.println("moved to next level");
				if(coins_earned>=level3) {
					System.out.println("cleared level 3");
					System.out.println("moved to next level");
				}
				else {
                    System.out.println("Need " + (level3 - coins_earned) + " more coins to clear level 3");
                }

            } else {
                System.out.println("Need " + (level2 - coins_earned) + " more coins to clear level 2");
            }

        } else {
            System.out.println("Need " + (level1 - coins_earned) + " more coins to clear level 1");
        }

        s.close();
	}

}
