package _8_BitwiseOperations;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the base and power value");
        int base=in.nextInt();
        int power=in.nextInt();
        int ans=1;
        while(power>0)
        {
           if((power&1)==1)
           {
               ans*= base;
           }
           base*=base;
           power=power>>1;
        }
        System.out.println(ans);
    }
}
