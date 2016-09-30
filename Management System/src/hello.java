import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class hello {
	static room r;
	static company comp;
	static int ch=-1;
	static int ch1;
	static int food_cost=2000, invitation_cost=2000;
	static String s;
	static int a,b,c;
	static String username;
	static String pwd;
	static BufferedReader br;
	static InputStreamReader isr;
	public static void main(String[] args) throws IOException{
		r = new room();
		comp =  new company();
	
		   isr = new InputStreamReader(System.in);
		
			System.out.println("Hello!");
			br = new BufferedReader(isr);
			
			
			while(ch!=0)
			{
				System.out.println("1.Book seminar rooms ");
				System.out.println("2.Book video conference rooms ");
				System.out.println("3.Book interview rooms ");
				System.out.println("4.Request additional services");
				System.out.println("5.Check budget ");
				System.out.println("0.Approve ");
				br = new BufferedReader(isr);
				ch = Integer.parseInt(br.readLine());
				
				switch(ch)
				
				{
				case 1: System.out.println("enter no of seminar rooms");
				a = Integer.parseInt(br.readLine());
				r.requestroom(a, 0, 0,comp);
						break;
						
				case 2: System.out.println("enter no of conference rooms");
				b = Integer.parseInt(br.readLine());
				r.requestroom(0, b, 0,comp);
						break;
				
				case 3: System.out.println("enter no of interview rooms");
				c =Integer.parseInt(br.readLine());
				r.requestroom(0, 0, c,comp);
						break;
						
				case 4: 
						System.out.println("1.Invitation print and distribution");
						System.out.println("2.Food Arrangement");
						br = new BufferedReader(isr);
						ch1 = Integer.parseInt(br.readLine());
						switch(ch1)
						{
						case 1: System.out.println("Are you sure you want to print Invitation ? (y/n) [Rs. 2000]");
								s = br.readLine();
								if(s.equals("y"))
								{
									comp.invitations=true;
									System.out.println("Added in final budget");
								}
								
									break;	
							
						case 2: System.out.println("Are you sure you want food arrangemnt ? (y/n) [Rs. 2000]");
							s = br.readLine();
							if(s.equals("y"))
							{
								comp.food=true;
								System.out.println("Added in final budget");
							}
						
							break;	
							
						}
						
					break;	
						
						
				case 5: System.out.println("Status : ");
						
						 System.out.println("Video conference rooms : "+comp.vr+"   price : Rs."+(comp.vr * r.vr_price));
						 System.out.println("Additional seats in Video conference room  : "+comp.vra+"   price : Rs."+(comp.vra * r.seat_price));
						 comp.vc_total = (comp.vr * r.vr_price) + (comp.vra * r.seat_price);
						 System.out.println("Total:" + comp.vc_total+"\n");

						 System.out.println("Seminar rooms : "+comp.sr+"   price : Rs."+(comp.sr * r.sr_price));
						 System.out.println("Additional seats in eminar  room  : "+comp.sra+"   price : Rs."+(comp.sra * r.seat_price));
						 comp.sr_total=(comp.sr * r.sr_price)+(comp.sra * r.seat_price);
						 System.out.println("Total:" + comp.sr_total+"\n");
						 
						 System.out.println("Interview rooms : "+comp.ir+"   price : Rs."+(comp.ir * r.ir_price));
						 System.out.println("Additional seats in Interview room  : "+comp.ira+"   price : Rs."+(comp.ira * r.seat_price));
						 comp.ir_total=(comp.ir * r.ir_price)+(comp.ira * r.seat_price);
						 System.out.println("Total:" + comp.ir_total+"\n");
						 
						if(comp.food)
						{
							System.out.println("Food arrangement:" + food_cost);
						}
						if(comp.invitations)
						{
							System.out.println("Invitation cost:" + invitation_cost);
						}
						 
						 comp.budget=(comp.vc_total+comp.sr_total+comp.ir_total) + ((comp.food)?2000:0) + ((comp.invitations)?2000:0);
						 System.out.println("Total Budget:" +comp.budget +"\n");

						break;
				
					
				default: System.out.println("default");
				
				}
			}
			System.out.println("Total Budget:" +comp.budget +"\n");
			System.out.println("Advance to be paid:" +comp.budget*0.2 +"\n");
			
			
			
	}

}
