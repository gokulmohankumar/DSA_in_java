package _6_Patterns;

import java.util.Scanner;

public class Pattern5_halfDiamond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = in .nextInt();
        for (int i = 1; i <=2*n-1 ; i++) {
            int colend=i;
            if(i>n){
                colend=(2*n-i);
            }
            for (int j = 1; j <=colend ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
