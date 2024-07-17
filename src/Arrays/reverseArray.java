package Arrays;
import java.util.Arrays;

public class reverseArray {
    //two pointer method
    private static void RevArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    private static void swap(int []arr,int start, int end) {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println("Before Reversing"+(Arrays.toString(arr)));
        RevArray(arr);
        System.out.println("After reversing"+(Arrays.toString(arr)));
    }
}
