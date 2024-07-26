package _2_RegularProblems;

import java.util.Scanner;

public class PalindromeNumber {
    static int findrev(int n)
    {
        int rev=0;
        while(n!=0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number to check palindrome : ");
        int n=in.nextInt();
        int rev=findrev(n);
        if(n==rev)
        {
            System.out.println("Given number is Palindrome!");
        }
        else {
            System.out.println("Not a Palindrome!");
        }
    }
}
