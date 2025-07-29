package constructors;
public class Online_payments {
	String bill_type,name;
	int service_num,amount,net,mobile;
	double volume;
	Online_payments (String type,int num,int amount,String name){
		System.out.println("the Electricity bill payment");
		bill_type=type;
		service_num=num;
		this.amount=amount;
		this.name=name;
	}
	Online_payments(String type,double volume,String name,int amount){
		System.out.println("the water bill payment");
		bill_type=type;
		this.volume=volume;
		this.name=name;
		this.amount=amount;
	}
	Online_payments(String type,String name,int net,int amount){
		System.out.println("the internet bill payment");
		bill_type=type;
		this.name=name;
		this.net=net;
		this.amount=amount;
	}
	Online_payments(String type,int mobile,String name,int amount){
		System.out.println("the mobile bill payment");
		bill_type=type;
		this.name=name;
		this.mobile=mobile;
		this.amount=amount;
	}
	public static void main(String[] args) {
		Online_payments o=new Online_payments("online",192345,1200,"shashi");
		System.out.println("bill_type:"+o.bill_type);
		System.out.println("service number:"+o.service_num);
		System.out.println("amount:"+o.amount);
		System.out.println("name:"+o.name);
		Online_payments o2=new Online_payments("online",19,1300,"shashi");
		System.out.println("bill_type:"+o2.bill_type);
		System.out.println("volume:"+o2.volume);
		System.out.println("amount:"+o2.amount);
		System.out.println("name:"+o2.name);
		Online_payments o3=new Online_payments("online","shashi",134,1400);
		System.out.println("bill_type:"+o3.bill_type);
		System.out.println("name:"+o3.name);
		System.out.println("name:"+o3.net);
		System.out.println("amount:"+o3.amount);
		Online_payments o4=new Online_payments("online",630883838,"shashi",1400);
		System.out.println("bill_type:"+o4.bill_type);
		System.out.println("mobile_num:"+o4.mobile);
		System.out.println("name:"+o4.name);
		System.out.println("amount:"+o4.amount);
	}
}
