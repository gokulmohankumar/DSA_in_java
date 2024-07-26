package _3_Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class SpanofanArray {

    private static int findSpan(int[] arr) {
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length-1];
        return max- min;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = in.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println("Span of the given array is : \n"+findSpan(arr));
    }
}
