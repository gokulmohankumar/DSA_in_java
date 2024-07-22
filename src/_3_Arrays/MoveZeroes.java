package _3_Arrays;

import java.util.Arrays;

public class MoveZeroes {

    //Two pointer Approach

    private static int[] moveZeroesToend(int[] arr) {
        int z=0,nz=0;
        int size=arr.length;
        if(size==0||size ==1) return arr;
        while(nz<size)
        {
            if(arr[nz]!=0)
            {
                int temp=arr[nz];
                arr[nz]=arr[z];
                arr[z]=temp;
                nz++;
                z++;
            }
            else {
                nz++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int []arr={0,10,5,6,3,0,0,13,0};
        System.out.println(Arrays.toString(moveZeroesToend(arr)));
    }
}
