package _2_regularProblems;
import java.util.Scanner;

public class Factorial {
    static int factorial(int n)
    {
        int fact=n;
        if(n<=1)
        {
            return 1;
        }
        else
        {
            fact=fact*(factorial(fact-1));
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number to find the factorial: ");
        int n=in.nextInt();
        System.out.println("Factorial of "+n+" = "+factorial(n));
  }
}

