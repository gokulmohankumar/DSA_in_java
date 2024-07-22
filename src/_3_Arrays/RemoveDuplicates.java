package _3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {

    private static void removeDuplicateelements(int[] arr) {
        int n=arr.length;
        int rd=0;
        for (int i = 0; i < n; i++) {
            if(arr[rd]!=arr[i])
            {
                rd++;
                arr[rd]=arr[i];
            }
        }
        for (int i = 0; i <=rd ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = in.nextInt();
        int []arr=new int[n];
        System.out.println("enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println("Before:\n"+Arrays.toString(arr));
        System.out.println("After removing duplicates");
        removeDuplicateelements(arr);
    }
}
