package _1_flowOfProgram;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the year to find whether it is a lepa year ");
        int year = in.nextInt();
        if(year%4==0 && (year%100!=0 || year%400==0))
            System.out.println(year + " It is leap year!");
        else
        {
            System.out.println(year + " Not a leap year");
        }
    }
}
