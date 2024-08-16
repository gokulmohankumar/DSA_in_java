package _8_BitwiseOperations;

import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to find: ");
        int n=in.nextInt();
        System.out.println(findMagic(n));
    }
    public static int findMagic(int n)
    {
        int ans=0;
        int base=5;
        while (n>0){
            int last = n & 1;
            n=n>>1;
            ans+=last*base;
            base*=5;
        }
        return ans;
    }
}
