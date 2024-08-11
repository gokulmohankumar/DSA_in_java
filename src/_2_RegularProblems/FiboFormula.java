package _2_RegularProblems;

import java.util.Scanner;

public class FiboFormula {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the N to get Nth fibonacci number: ");
        long n=in.nextLong();
        System.out.println(fibo(n));
    }
    private static long fibo(long n)
    {
        return (long)(((Math.pow((1+Math.sqrt(5))/2,n))-(Math.pow((1-Math.sqrt(5))/2,n)))/Math.sqrt(5));
    }
}
