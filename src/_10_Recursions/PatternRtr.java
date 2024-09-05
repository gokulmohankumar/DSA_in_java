package _10_Recursions;

import java.util.Scanner;

public class PatternRtr {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of rows to print Right traingle");
        int n=in.nextInt();
        System.out.println("Inverted triangle");
        printPattern1(n,0);
        System.out.println("Straight triangle");
        printPattern2(n,0);
    }
    public static void printPattern1(int r,int c)
    {
        if(r==0)
        {
            return;
        }
        if(c<r)
        {
            System.out.print("* ");
            printPattern1(r,c+1);
        }
        else {
            System.out.println();
            printPattern1(r-1,0);
        }
    }
    public static void printPattern2(int r,int c)
    {
        if(r==0)
        {
            return;
        }
        if(c<r)
        {
            printPattern2(r,c+1);
             System.out.print("* ");
        }
        else {
            printPattern2(r-1,0);
            System.out.println();
        }
    }
}
