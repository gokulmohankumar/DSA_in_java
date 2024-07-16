package _2_regularProblems;

import java.util.Scanner;

public class Simple_Compound_Interest {
    static double simpleInterest(double p, double n,double r)
    {
        double SI;
        SI = (p*n*r)/100;
        return SI;
    }
    static double compoundInterest(double p,double n, double r)
    {
        double CI;
        CI = (p*Math.pow((1+r/100),n))-p;
        return CI;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the principal amount, time, rate to find the interests");
        double principal=in.nextDouble();
        double rate=in.nextDouble();
        double time=in.nextDouble();
        System.out.println("Simple Interest is : "+simpleInterest(principal,time,rate));
        System.out.println("Compound Interest is : "+compoundInterest(principal,time,rate));
    }
}
