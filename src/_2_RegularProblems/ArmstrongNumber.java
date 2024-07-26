package _2_RegularProblems;

import java.util.Scanner;

public class ArmstrongNumber {
    static boolean checkArmstrong(int number)
    {
        int res=0;
        int n=number;
        int digits=findNumberOfDigits(number);
        while(n>0)
        {
            int lastdigit=n%10;
            res+= (int)Math.pow(lastdigit,digits);
            n=n/10;
        }
        return (res==number);
    }
    static int findNumberOfDigits(int number)
    {
        int digits=1;
        while(number/10>0)
        {
            digits++;
            number=number/10;
        }
        return digits;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number to check Armstrong or not");
        int n=in.nextInt();
        if(checkArmstrong(n))
        {
            System.out.println(n+" it ia an armstrong number");
        }
        else {
            System.out.println("It is not an Armstrong number");
        }
    }
}
