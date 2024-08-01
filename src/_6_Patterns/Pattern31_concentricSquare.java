package _6_Patterns;

import java.util.Scanner;

public class Pattern31_concentricSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = in .nextInt();
        int originalN=n;
        n=2*n;
        for (int rows = 1; rows <n; rows++) {
            for (int cols = 1; cols <n; cols++) {
                int num=originalN-Math.min(Math.min(rows,cols),Math.min(n-rows,n-cols))+1;
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
