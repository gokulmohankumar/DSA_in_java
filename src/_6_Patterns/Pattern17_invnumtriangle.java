package _6_Patterns;

import java.util.Scanner;

public class Pattern17_invnumtriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = in .nextInt();
        for (int row = 1; row <=2*n-1 ; row++) {
            int totalcols=(row>n)?2*n-row:row;
            int spaces=n-totalcols;
            for (int s = 1; s <= spaces ; s++) {
                System.out.print(" ");
            }
            for (int cols = totalcols; cols >=1 ; cols--) {
                System.out.print(cols);
            }
            for (int cols = 2; cols <= totalcols; cols++) {
                System.out.print(cols);
            }
            System.out.println();
        }
    }
}
