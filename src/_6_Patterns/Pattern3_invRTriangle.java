package _6_Patterns;

import java.util.Scanner;

public class Pattern3_invRTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = in .nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j<=n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
