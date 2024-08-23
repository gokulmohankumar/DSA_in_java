package _9_Strings_Easy_level;

import java.util.Scanner;

public class AddNumericalString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter two numerical string to add ex(123 897)");
        String s1=in.next();
        String s2=in.next();
        try {
            int sum = Integer.parseInt(s1) + Integer.parseInt(s2);
            System.out.println("Sum = " + sum);
            System.out.println(String.valueOf(sum));//output as string;
        }
        catch (Exception e) {
            System.out.println("Entered string was unable to parsed to int, ensure it is numerical");
            throw new RuntimeException(e);
        }
    }
}
