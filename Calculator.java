import java.util.Scanner;

public class Calculator{

    static Double add(Double a, Double b){
        Double res = a + b;
        return res;
    }

    static Double subtract(Double a, Double b){
        Double res = a - b;
        return res;
    }

    static Double multiply(Double a, Double b){
        Double res = a * b;
        return res;
    }

    static Double divide(Double a, Double b){
        Double res = a / b;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number 1:");
        Double a = sc.nextDouble();
        System.out.println("Number 2:");
        Double b = sc.nextDouble();
        System.out.println("add, subtract, multiply, or divide: ");
        String op = sc.next();

        if(op.equals("add")){
            System.out.println(add(a,b));
        }

        else if(op.equals("subtract")){
            System.out.println(subtract(a,b));
        }

        else if(op.equals("multiply")){
            System.out.println(multiply(a,b));
        }

        else if(op.equals("divide")){
            System.out.println(divide(a,b));
        }
        sc.close();
    }
}


