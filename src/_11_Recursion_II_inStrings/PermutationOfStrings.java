package _11_Recursion_II_inStrings;

import java.util.Scanner;

public class PermutationOfStrings {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string to print its permutations");
        String str=in.next();
        printAllPermutation(str,"");
    }
    public static void printAllPermutation(String str,String res)
    {
        if(str.isEmpty())
        {
            System.out.print(res+" ");
            return ;
        }
        char ch=str.charAt(0);
        for (int i = 0; i <=res.length(); i++) {
            String f=res.substring(0,i);
            String s=res.substring(i);
            printAllPermutation(str.substring(1),f+ch+s);
        }
    }
}
