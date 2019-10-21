import java.util.Scanner;
public class PrintNo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter the start no");
		int start;
	int sno=Sc.nextInt();
	System.out.println("Enter the end no");
	int endno=Sc.nextInt();
	for(start=sno;start<=endno;start++)
	{
		System.out.println(start);
	}		
		}
	}

