package _7_Sorting;

import java.util.ArrayList;
import java.util.List;

public class Cs_findAllDuplicates {
    public static void main(String[] args) {
        int []arr={4,3,2,7,8,2,3,1};
        System.out.println(findAllDuplicates(arr));
    }
    public static List<Integer> findAllDuplicates(int[] arr){
        int n = arr.length;
        int i=0;
        List<Integer>list=new ArrayList<>(n);

        while(i<n)
        {
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex])
            {
                int temp=arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;
            }
            else {
                i++;
            }
        }
        for(int j=0;j<n;j++)
        {
            if(arr[j]!=j+1) list.add(arr[j]);
        }
        return list;
    }
}
