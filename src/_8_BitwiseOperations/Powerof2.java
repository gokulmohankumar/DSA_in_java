package _8_BitwiseOperations;

import java.util.Scanner;

public class Powerof2 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number to find whether it is the power of 2: ");
        int n = in.nextInt();
        boolean ans=(n&(n-1))==0;
        System.out.println(ans);
    }
}
