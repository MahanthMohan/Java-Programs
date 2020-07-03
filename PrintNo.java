import java.util.Scanner;

public class PrintNo {
	public static void main(String[] args) {
		// TODO Auto-generated Method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the start no");
	int start;
	int sno  =  sc.nextInt();
	System.out.println("Enter the end no");
	int endno = sc.nextInt();
	for(start = sno; start <= endno; start++)
	{
		System.out.println(start);
	}
	sc.close();		
		}
	}

