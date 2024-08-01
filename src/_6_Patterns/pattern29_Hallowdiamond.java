package _6_Patterns;

import java.util.Scanner;

public class pattern29_Hallowdiamond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = in .nextInt();
        for(int row=1;row<=2*n-1;row++)
        {
            int totalcols=(row>n)?2*n-row:row;
            int spaces=n-totalcols;
            for (int cols = 1; cols <=totalcols ; cols++) {
                System.out.print("*");
            }
            for(int s=1;s<=2*spaces;s++)
            {
                System.out.print(" ");
            }
            for (int cols = 1; cols <=totalcols ; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
