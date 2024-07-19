package _3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinandMaxnumbers {
    // using in build function for sorting
    private static void findMinandMax1(int[] arr) {
        Arrays.sort(arr);
        System.out.println("1. By sorting : ");
        System.out.println("Min: "+arr[0]);
        System.out.println("Max: "+arr[arr.length-1]);
    }
    //By loop and comparision
    private static void fingMinandMax2(int[] arr) {
        int min=arr[0];
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min) min=arr[i];
            if(arr[i]>max) max=arr[i];
        }
        System.out.println("2. Using loop and comparing");
        System.out.println("Min : "+ min);
        System.out.println("Max: "+max);
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = in.nextInt();
        System.out.println("Enter the elements with space");
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        findMinandMax1(arr);
        fingMinandMax2(arr);
    }
}
