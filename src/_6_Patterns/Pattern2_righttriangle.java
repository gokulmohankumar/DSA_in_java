package _6_Patterns;

import java.util.Scanner;

public class Pattern2_righttriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the no. of rows: ");
        int n=in.nextInt();
        for (int row = 1; row <= n; row++) {
            for(int col=1;col<= row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
