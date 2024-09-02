package _10_Recursions;

import java.util.Scanner;

public class PrintNto1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter value of N to print till the 1 in recursion.");
        int n=in.nextInt();
        fun(n);
    }
    public static void fun(int n)
    {
        if(n==0)
        {
            return ;
        }
        System.out.println(n);
        fun(n-1);
    }
}
