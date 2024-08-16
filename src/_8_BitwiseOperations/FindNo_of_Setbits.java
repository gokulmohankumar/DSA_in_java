package _8_BitwiseOperations;

import java.util.Scanner;

public class FindNo_of_Setbits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to find the no of setbits");
        int n= in.nextInt();
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBits(n));
    }
    private static int setBits(int n)
    {
        int count=0;
        while(n>0)
        {
            count++;
            n-=(n&(-n));
        }
        return count;
    }
}
