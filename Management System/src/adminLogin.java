import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class adminLogin {

	static String username;
	static String pwd;
	static BufferedReader br;
	static InputStreamReader isr;
	public void login()
	{
		System.out.println("Enter username: ");
		
		try {
			username = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Enter password: ");
		br = new BufferedReader(isr);
		try {
			pwd = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(username.equals("apple") && pwd.equals("iphone")){
			System.out.println("logged in successfully");
		}
		else{
			System.out.println("log in failed");
		}
	}
}
