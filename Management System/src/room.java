import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class room {
	private static int sr=30,vr=10,ir=20;
	public static int vr_price=5000,sr_price=2000,ir_price=1000,seat_price=50;
	static int seats=20;
	static String s;
	static BufferedReader br;
	static InputStreamReader isr;
	
	public room(){
		 isr = new InputStreamReader(System.in);
		 br=new BufferedReader(isr);
		 
	}
	
	public void requestroom(int a,int b, int c,company comp) throws IOException {
		int temp_s;
		if(a!=0)
		if(sr<a) 
		{
				System.out.println("only "+sr+" seminar rooms available");
				
		}
		else{
			sr=sr-a;
			comp.sr=a;
			System.out.println("do you want additional seats ? (y/n)");
			s= br.readLine();
			if(s.equals("y"))
			{
				System.out.println("enter no ");
				 
				temp_s= Integer.parseInt(br.readLine());
				if(temp_s>20)
				{
					System.out.println("Sorry! Only 20 extra seats can be requested!!");
				}
				else
				{
					comp.sra=temp_s;
					System.out.println("added successfully");
				}
				
			}
		}
		if(b!=0)
		if(vr<b) 
		{
				System.out.println("only "+vr+" conference rooms available");
		}
		else{
			vr=vr-b;
			comp.vr=b;
			System.out.println("do you want additional seats ? (y/n)");
			s= br.readLine();
			if(s.equals("y"))
			{
				System.out.println("enter no ");
				 
				
				temp_s= Integer.parseInt(br.readLine());
				if(temp_s>20)
				{
					System.out.println("Sorry! Only 20 extra seats can be requested!!");
				}
				else
				{
					comp.vra=temp_s;
					System.out.println("added successfully");
				}
			}
		}
		
		if(c!=0)
		if(ir<c) 
		{
				System.out.println("only "+ir+" interview rooms available");
		}
		else{
			ir=ir-c;
			comp.ir=c;
			System.out.println("do you want additional seats ? (y/n)");
			s= br.readLine();
			if(s.equals("y"))
			{
				System.out.println("enter no ");
				 
				temp_s= Integer.parseInt(br.readLine());
				if(temp_s>20)
				{
					System.out.println("Sorry! Only 20 extra seats can be requested!!");
				}
				else
				{
					comp.ira=temp_s;
					System.out.println("added successfully");
				}
			}
		}
	}
	
 
}
