package _3_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class OccurencesofAnelement {

    private static void findFrequency(int []arr) {
        Arrays.sort(arr);
        int freq = 1;
        int i;
            for (i = 1; i < arr.length; i++) {
                if (arr[i] == arr[i - 1]) {
                    freq++;
                } else {
                    System.out.println(arr[i - 1] + " occurs " + freq + " times");
                    freq = 1;
                }
            }
            System.out.println(arr[i - 1] + " occurs " + freq+" times");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //get inputs
        System.out.println("Enter the size of the array");
        int n=in.nextInt();
        int[]array=new int[n];
        System.out.println("enter the elements of the array");
        for (int i = 0; i <n ; i++) {
            array[i]=in.nextInt();
        }
        findFrequency(array);
    }
}
