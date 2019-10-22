import java.util.Scanner;
public class DollarsandChanges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double Amount,Cents,Quarters,Dimes,Dollars;
		char Operation;
    Scanner AMOUNT=new Scanner(System.in);
    System.out.println("Enter the amount of money you have in dollars");
    Amount=AMOUNT.nextDouble();
    System.out.println("Enter Operation: Cents(1),Quarters(2),Dimes(3),Dollars and cents(4)");
    Operation=AMOUNT.next().charAt(0);
    switch(Operation)
    {
    case '1':
    	 Cents=Amount*100;
         System.out.println(Cents+" "+Cents );
         break;
    case '2':
    	Quarters=(Amount*100)/25;
    	System.out.println(Quarters+" "+Quarters);
    	break;
    case '3':
    	Dimes=(Amount*100)/10;
    	System.out.println(Dimes+" "+Dimes);
    	break;
    case '4':
    	Cents=(Amount*100)%100;
    	Dollars=((Amount*100)/100)-(Cents/100);
    	System.out.println(Dollars+" "+"dollars and"+" "+Cents+" "+"cents");
    	break;

    }
   
    
    



	}

}
