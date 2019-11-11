import static java.lang.System.out;
import java.util.Scanner;
public class Account {

	 String name,address,bankname,display;
	double balance;
	static int Accno;
	public void display()
	{
		System.out.println(name);
		System.out.println(bankname);
		System.out.println(address);
		System.out.println(balance);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		Account myAccount=new Account();
		Account yourAccount=new Account();
		System.out.println("Enter the Acc no - First Acc(1) and Second Acc(2)");
		Accno=keyboard.nextInt();
		if(Accno==1)
		{
		System.out.println("Enter the name of the Account");
		myAccount.name=keyboard.next();
		System.out.println("Enter the name of the bank");
		myAccount.bankname=keyboard.next();
		System.out.println("Enter the address of the bank");
		myAccount.address=keyboard.next();
		System.out.println("Enter the outstanding balance of the account");
		myAccount.balance=keyboard.nextInt();
		keyboard.close();
		myAccount.display();
		}
		else if(Accno==2)
		{
		System.out.println("Enter the name of the Account");
		yourAccount.name=keyboard.next();
		System.out.println("Enter the name of the bank");
		yourAccount.bankname=keyboard.next();
		System.out.println("Enter the address of the bank");
		yourAccount.address=keyboard.next();
		System.out.println("Enter the outstanding balance of the account");
		yourAccount.balance=keyboard.nextInt();
		keyboard.close();
		yourAccount.display();
		}
	}

}
