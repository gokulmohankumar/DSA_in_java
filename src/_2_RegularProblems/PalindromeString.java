package _2_RegularProblems;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        StringBuilder s1;
        s1= new StringBuilder(in.next().toLowerCase());
        StringBuilder s2= new StringBuilder();
        for(int i = s1.length()-1; i>=0; i--)
        {
            s2.append(s1.charAt(i));
        }
       if(s1.compareTo(s2) == 0)
           System.out.println("given String is Palindrome!");
       else System.out.println("Not a palindrome");
    }
}
