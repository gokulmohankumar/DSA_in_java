package _8_BitwiseOperations;

import java.util.Scanner;

public class RangeXOR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the range to find XOR");
        int A= in.nextInt();
        int B= in.nextInt();
        int ans=xor(B)^xor(A-1);
        System.out.println("Xor for the given range "+A+" to "+B+" is : "+ans);
    }
    static int xor(int a)
    {
        if(a%4==0) return a;
        else if(a%4==1) return 1;
        else if(a%4==2) return a+1;
        else return 0;
    }
}
