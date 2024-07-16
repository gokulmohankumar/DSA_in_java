package _1_flowOfProgram;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter an number to print Table : ");
        int n=in.nextInt();
        for(int i=1;i<=20;i++)
        {
            System.out.println(i+" * "+n+" = "+(i*n));
        }
    }
}
