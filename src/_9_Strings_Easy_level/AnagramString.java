package _9_Strings_Easy_level;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two Strings seperated by space to check whether it is an Anagram or not.");
        String s1=in.next();
        String s2=in.next();
        boolean isAnagramMethod1=checkIsAnagramMethod1(s1,s2);
        System.out.println(isAnagramMethod1);
    }
    public static boolean checkIsAnagramMethod1(String s1,String s2)
    {
        String str1=s1.replaceAll("\\s","");
        String str2=s2.replaceAll("\\s","");
        if(str1.length()!=str2.length())
        {
            return false;
        }
        else {
            char[]s1arr=str1.toLowerCase().toCharArray();
            Arrays.sort(s1arr);
            char[]s2arr=str2.toLowerCase().toCharArray();
            Arrays.sort(s2arr);
            return Arrays.equals(s1arr,s2arr);
        }
    }
}
