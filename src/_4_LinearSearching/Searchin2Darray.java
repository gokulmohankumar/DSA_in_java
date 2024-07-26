package _4_LinearSearching;
import java.util.Arrays;

public class Searchin2Darray {
    private static int[] search(int[][]arr,int target)
    {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]==target)
                {
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1};
    }
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,10},
                {4,5,6,20},
                {7,8,9,30}
        };
        int target=20;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
}
