package loginSystem;
import java.util.*;
public class Logins {

	public static void main(String[] args) {
		Scanner inputs =new Scanner(System.in);
		String correctusername = "Masawi";
		String correctpassword ="M1234";
		for(int attempts =1; attempts <=3; attempts ++) {
			System.out.println(attempts);
			System.out.println("Enter your username:");
			String username = inputs.nextLine();
			System.out.println("Enter your password:");
			String password = inputs.nextLine();
			if
			(username.equals(correctusername)&& password.equals(correctpassword))
			{
				System.out.println("Login successful!");
				break;
			} else {
				System.out.println("Incorrect username or password.");
			}
			if(attempts ==3) {
				System.out.println("Too many attempts.Account locked.");
			}
		}
		inputs.close();
				
			} 
				
			
			
		}

	


