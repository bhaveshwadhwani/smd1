
public class BookTicket 
{
	public int NoOfSeatAvailable;
	public String Date;
	public String Time;
	public String Password="PR212";
	
	Customer ct = new Customer();
	
	public void UpdateSeatAvailable()
	{
		NoOfSeatAvailable = NoOfSeatAvailable - ct.Quant;
	}
}
