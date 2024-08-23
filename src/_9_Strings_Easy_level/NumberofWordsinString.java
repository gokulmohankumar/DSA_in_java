package _9_Strings_Easy_level;

import java.util.Scanner;

public class NumberofWordsinString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string to count the number of words");
        String str=in.nextLine();
        countMethod1(str);
        countMethod2(str);
    }
    public static void countMethod1(String str) {
        String[] s1 = str.split(" ");
        int words = s1.length;
        System.out.println("method 1: Number of words : " + words);
    }
    public static void countMethod2(String str)
    {
        int count=0;
        if(str.charAt(0)!=' ')
        {
            count++;
        }
        for (int i = 1; i <str.length()-1 ; i++) {
            if(str.charAt(i)==' ')
            {
                count++;
            }
        }
        System.out.println("mwthod2: number of words : "+count);
    }
}
