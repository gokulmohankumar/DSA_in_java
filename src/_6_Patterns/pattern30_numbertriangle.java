package _6_Patterns;

import java.util.Scanner;

public class pattern30_numbertriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = in .nextInt();
        for (int row = 1; row <=n ; row++) {
            int spaces=2*(n-row);
            for (int s = 1; s <= spaces ; s++) {
                System.out.print(" ");
            }
            for (int cols = row; cols >=1 ; cols--) {
                System.out.print(cols+" ");
            }
            for (int cols = 2; cols <=row ; cols++) {
                System.out.print(cols+" ");
            }
            System.out.println();
        }
    }
}
