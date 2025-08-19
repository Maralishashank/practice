package booking;
import java.util.Scanner;
public class Hyderbad_metro {
	public static void main(String[] args) {
		Hyderbad_metro h=new Hyderbad_metro();
		Scanner s=new Scanner(System.in);
		String username,name,password,Password;;
		char c;
	    int balance = 0,dis=0,fare=0,amount,e,count=0,a,source,dest;	
		    System.out.println("please register with username and Password");
		    System.out.println("enter a user name:");
		    username=s.next();
		    System.out.println("enter a password:");
		    password=s.next();
		    System.out.println("registration completed you can login now");
		    boolean r=true;
		    while(r) {
		    System.out.println("enter the login details");
		    System.out.print("enter user name: ");
		    name=s.next();
		    System.out.println("enter the password: ");
		    Password=s.next();
		    if (name.equals(username)&&Password.equals(password)) {
		            System.out.println("logged in successfully");
			    	while(true) {
			    	System.out.println("-----menu------");
			    	System.out.print("1.recharge Metro Card");
			    	System.out.println("      2.Book tickets");
			    	System.out.print("3.view balance");
			    	System.out.println("             4.view last ticket details");
			    	System.out.print("5.logout");
			    	System.out.println("                   6.exit");
			    	System.out.print("enter a choice:");
			    	a=s.nextInt();
			    	switch(a) {
			    	case 1:
			    		System.out.println("enter the amount to add:");
			    		amount=s.nextInt();
			    		balance+=amount;
			    		System.out.println("current balance:"+balance);
			    		break;
			    	case 2:
			    		do {
			    		System.out.println("-----metro lines-----");
			    		System.out.println("1.Red Line: L.B. Nagar – Miyapur");
			    		System.out.println("2.Blue Line: Nagole – Raidurg");
			    		System.out.println("3.Green Line: JBS – MGBS");
			    		System.out.println("select a metro line:");
			    		a=s.nextInt();
			    		switch(a) {
			    		case 1:
			    			System.out.println("---stations---");
			    			System.out.println("1.L.B. Nagar");
			    			System.out.println("2.Dilsukhnagar");
			    			System.out.println("3.MG Bus Station (MGBS)");
			    			System.out.println("4.Ameerpet");
			    			System.out.println("5.Miyapur");
			    			System.out.println("how many tickets do u want to book:");
			    			e=s.nextInt();
			    			for(int i=0;i<e;i++) {
			    				System.out.println("enetr source:");
			    				source=s.nextInt();
			    				System.out.println("enter destination:");
			    				dest=s.nextInt();
			    				if(source<0||dest<0||source==dest) {
			    					System.out.println("invalid stations");
			    				}
			    				balance=h.booking(source,dest,dis,fare,balance);
			    				count++;
			    			}
			    			break;
			    		case 2:
			    			System.out.println("---stations---");
			    			System.out.println("1.Nagole");
			    			System.out.println("2.Uppal");
			    			System.out.println("3.Paradise");
			    			System.out.println("4.Ameerpet");
			    			System.out.println("5.Raidurg");	
			    			System.out.println("how many tickets do u want to book:");
			    			e=s.nextInt();
			    			for(int i=0;i<e;i++) {
			    				System.out.println("enetr source:");
			    				source=s.nextInt();
			    				System.out.println("enter destination:");
			    				dest=s.nextInt();
			    				if(source<0||dest<0||source==dest) {
			    					System.out.println("invalid stations");
			    				}
			    				balance=h.booking(source,dest,dis,fare,balance);
			    				count++;
			    			}
			    			break;
			    		case 3:
			    			System.out.println("---stations---");
			    			System.out.println("1.JBS Parade Ground");
			    			System.out.println("2.Parade Grounds");
			    			System.out.println("3.Secunderabad West");
			    			System.out.println("4.Gandhi Bhavan");
			    			System.out.println("5.MGBS");	
			    			System.out.println("how many tickets do u want to book:");
			    			e=s.nextInt();
			    			for(int i=0;i<e;i++) {
			    				System.out.println("enetr source:");
			    				source=s.nextInt();
			    				System.out.println("enter destination:");
			    				dest=s.nextInt();
			    				if(source<=0||dest<=0||source==dest) {
			    					System.out.println("invalid stations");
			    				}
			    				balance=h.booking(source,dest,dis,fare,balance);
			    				count++;
				    			}
				    			break;
			    	}
				    	System.out.println("Do you want to book more tickets?(y/n)");
				    	c=s.next().charAt(0);
			    		}
			    		while(c=='y');	
			    		break;
			    	case 3:
			    		System.out.println("current balance:"+balance);
			    		System.out.println("total number of tickets booked:"+count);
			    		break;
			    	case 4:
			    		System.out.println("--last ticket details--");
			    		System.out.println("source:");
			    		System.out.println("distance:");
			    		System.out.println("fare:");
			    		break;
			    	case 5:
			    		System.out.println("logged out successfully");
			    		break;
			    	case 6:
			    		System.out.println("logged out and exited the page");
			    		return;
			    	default:
			    		System.out.println("enter a valid choice");
			           }
			    	if(a==5)break;
                }  	
		    } 
		    else 
                System.out.println("Invalid username or password.");      
		    }
		s.close();
    }
	
public int booking(int source,int dest,int dis,int fare,int balance) {
	dis=dest-source;
	if(dis==1) 
	fare=10;
	else if(dis==2) 
	fare=15;
	else if(dis==3) 
	    fare=20;
	else if(dis==4)
		fare=25;
	else if(dis>=5) 
		fare=35;
	if(balance>=fare) {
		balance-=fare;
		System.out.println("ticket booked succesfully");
		System.out.println("current balance:"+balance);
	}
	else {
		System.out.println("insufficient balance");
		System.out.println("please recharge your metro card");

	}
	return balance;
}
}

