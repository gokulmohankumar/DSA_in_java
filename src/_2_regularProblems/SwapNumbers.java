package _2_regularProblems;
import java.util.Scanner;

public class SwapNumbers {
    //using third variable
    static void swapMethod1(int a,int b)
    {
        int temp =a;
        a=b;
        b= temp;
        System.out.println("Method 1 : a = "+a+" b = "+b);
    }
    //without third variable using (+ and -)
    static void swapMethod2(int a,int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Method 2 : a = "+a+" b = "+b);
    }
    //without third variable using (* and /)
    static void swapMethod3(int a,int b)
    {
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("Method 3 : a = "+a+" b = "+b);
    }
    //without third variable using bitwise XOR ^
    static void swapMethod4(int a,int b)
    {
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("Method 4 : a = "+a+" b = "+b);
    }
    //In single statement !
    static void swapMethod5(int a,int b)
    {
        b=a+b-(a=b);
        System.out.println("Method 5 : a = "+a+" b = "+b);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two numbers to swap : ");
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println("Before Swapping :: a = "+a+" & b = "+b);
        System.out.println("After Swapping :: ");
        swapMethod1(a,b);
        swapMethod2(a,b);
        swapMethod3(a,b);
        swapMethod4(a,b);
        swapMethod5(a,b);
    }
}
