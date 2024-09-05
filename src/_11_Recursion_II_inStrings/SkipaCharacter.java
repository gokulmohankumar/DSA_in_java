package _11_Recursion_II_inStrings;

import java.util.Scanner;

public class SkipaCharacter {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=in.next();
        System.out.println("Enter a character to remove from that ");
        char chr=in.next().charAt(0);
        String res="";
        System.out.println(removeCharacter(res,str,chr));
    }
    private static String removeCharacter(String res,String s,char chr)
    {
       if(s.isEmpty())
       {
           return res;
       }
       char ch=s.charAt(0);
       if(ch!=chr)
       {
           res+=ch;
       }
       return removeCharacter(res,s.substring(1),chr);
    }
}
