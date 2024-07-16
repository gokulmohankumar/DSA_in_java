package _2_regularProblems;
import java.util.Scanner;

public class ArithmeticOperation {
    static int add(int a, int b)
    {
        return a+b;
    }
    static int subtract(int a, int b)
    {
        return a-b;
    }
    static int multiply(int a, int b)
    {
        return a*b;
    }
    static int divide(int a, int b)
    {
        if(b==0)
        {
            throw new ArithmeticException("Divide by zero is not possible");
        }
        return a/b;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(true) {
            System.out.println("enter a and b to perform arithmetic operation");
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println("Choose any options");
            System.out.println("+ Addition\n- Subtraction \n* Multiply \n/ Division \n# All operations\nx Exit");
            char c = in.next().charAt(0);
            switch (c) {
                case '+' -> System.out.println("Addition : " + add(a, b));
                case '-' -> System.out.println("Subtraction : " + subtract(a, b));
                case '*' -> System.out.println("Multiplication : " + multiply(a, b));
                case '/' -> System.out.println("division : " + divide(a, b));
                case '#' -> {
                    System.out.println("Addition : " + add(a, b));
                    System.out.println("Subtraction : " + subtract(a, b));
                    System.out.println("Multiplication : " + multiply(a, b));
                    System.out.println("Division : " + divide(a, b));
                }
                case 'x' -> {
                    in.close();
                    System.out.println("Exited good bye!");
                    System.exit(0);
                }
                default -> System.out.println("No options matched for execution!");
            }
        }
    }
}
