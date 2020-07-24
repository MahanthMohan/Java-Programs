import java.util.*;

public class hello {

public String sayHello(String name){
	String result = "Hello " + name;
	return result;
}

public static void main(String[] args){

Scanner sc = new Scanner(System.in);
hello Hello = new hello();
System.out.print("Your Name: ");
name = sc.next();
System.out.println("\n" + Hello.sayHello(name));

	}

}
