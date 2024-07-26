package _2_RegularProblems;

import java.util.Scanner;

public class FibonacciSeries {
    static int fibo(int n)
    {
        if(n==1 || n==2)
        {
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the value of n to get fibonacci series upto nth position: ");
        int n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print(fibo(i)+", ");
        }
    }
}
