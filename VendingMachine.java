import java.util.Scanner;
public class VendingMachine {
	public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	//Initialization
	float Quarters = 0.25f;
	float Dimes = 0.10f;
	float Nickles = 0.05f;
	float inQuarters;
	float inDimes;
	float inNickels;	
	System.out.println("Welcome to Tom's Vending machine");
	System.out.println("How many Quarters would you like to put in?");
	inQuarters = in.nextInt();
	System.out.println("How many Dimes would you like to put in?");
	inDimes = in.nextInt();
	System.out.println("How many Nickles would you like to put in?");
	inNickels = in.nextInt();
	float QuarterAmount=Quarters*inQuarters;
	float DimeAmount=Dimes*inDimes;
	float NickelAmount=Nickles*inNickels;
	float totalMoney=QuarterAmount+DimeAmount+NickelAmount;
	System.out.println("You have " +totalMoney+ " amount of dollars in the machine. Please select what food you'd like:");
	}
}
	