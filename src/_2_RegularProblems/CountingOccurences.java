package _2_RegularProblems;

import java.util.Scanner;

public class CountingOccurences {
    static int findOccurences(long number , long digit)
    {
        int count=0;
        while(number>0)
        {
            if(number%10==digit)
            {
                count++;
            }
            number=number/10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the whole number");
        long number =in.nextLong();
        System.out.println("Enter the digit for finding occurences in "+ number);
        long digit=in.nextInt();
        System.out.println(digit+ " occurs "+findOccurences(number,digit)+" times in "+number);
    }
}
