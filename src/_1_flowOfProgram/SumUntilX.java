package _1_flowOfProgram;

import java.util.Scanner;

public class SumUntilX {
    //X is other than numbers
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double n =0;
        while(in.hasNextInt() || in.hasNextDouble() || in.hasNextFloat())
        {
            n +=in.nextDouble();
        }
        System.out.println("Sum of all numbers is " + n);
    }
}
