
public class Customer 
{
	public int ID;
	public String Name;
	public int Mob;
	public String Address;
	public String UName;
	public String SLocation;
	public String ELocation;
	public int Quant;
	
	Payment pay = new Payment();
		
	public void getCustomer(int id,String name,int m,String addr)
	{
		ID = id;
		Name = name;
		Mob = m;
		Address = addr;
		
		System.out.println("Customer_ID :"+ID);
		System.out.println("Customer_Name :"+Name);
		System.out.println("Customer_Mob :"+Mob);
		System.out.println("Customer_Address :"+Address);
	}
	
	public void Login(String un ,String pwd)
	{
		BookTicket bt = new BookTicket();
		
		if(bt.Password==pwd)
		{
			System.out.println("Login Succesfully");
		}
		else
		{
			System.out.println("Login UnSuccesfull");
		}
	}
	
	public void BokTicket(String SLoc,String ELoc,int quan)
	{
		SLocation = SLoc;
		ELocation = ELoc;
		Quant = quan;
		
		System.out.println("StartLocation :"+SLocation);
		System.out.println("EndLocation :"+ELocation);
		System.out.println("Number_Of_Tickets :"+Quant);
		
		if((SLocation == "Pune" && ELocation == "Mumbai") || (SLocation == "Mumbai" && ELocation == "Pune") )
		{
			pay.Total_Fare = pay.Pune_Mumbai * Quant;
			System.out.println("Total_Fare :"+pay.Total_Fare);
			pay.ConfirmTicket();
		}
		else if((SLocation == "Pune" && ELocation == "Jalgaon") || (SLocation == "Jalgaon" && ELocation == "Pune"))
		{
			pay.Total_Fare = pay.Pune_Jalgaon * Quant;
			System.out.println("Total_Fare :"+pay.Total_Fare);
			pay.ConfirmTicket();
		}
	}
	
	public void CancleTicket()
	{
		Customer ct = new Customer();
		ct.Login("Pooja", "PR212");
	}
	
	public static void main(String args[])
	{
		Customer ct = new Customer();
		BookTicket bt = new BookTicket();
		String str = bt.Password;
		
		ct.getCustomer(1, "KUMUD", 787510764, "Jalgaon");
		ct.BokTicket("Pune", "Mumbai", 2);
		System.out.println("Your UserName is :"+ct.Name);
		System.out.println("Your Password is :"+str);
		System.out.println(".........................");
		
		ct.getCustomer(2, "Pooja", 940591836, "Raver");
		ct.BokTicket("Jalgaon", "Pune", 4);
		System.out.println("Your UserName is :"+ct.Name);
		System.out.println("Your Password is :"+str);
		
		ct.CancleTicket();
	}
}
