package _1_flowOfProgram;
import java.util.Scanner;

public class HCFandLCM {
    //Euclids and Abriel Lame Algorithm
    //time complexity for both gcd and lcm is O(log(min(a,b))
    static int gcd(int a,int b)
    {
        while(a!=0 && b!=0)
        {
            if(a>b)
            {
                a=a%b;
            }
            else {
                b=b%a;
            }
        }
        return a==0?b:a;
    }
    static int lcm(int a, int b)
    {
        int GCD=gcd(a,b);
        return (a*b)/GCD;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter two numbers to find HCF and LCM ");
        int a = in.nextInt();
        int b=in.nextInt();
        System.out.println("GCD/HCF is : "+gcd(a,b));
        System.out.println("LCM is : "+lcm(a,b));
    }
}
