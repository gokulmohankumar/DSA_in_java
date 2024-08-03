package _7_Sorting;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
import java.util.ArrayList;
import java.util.List;

public class Cs_findAllMissing {
    public static void main(String[] args) {
       int []arr={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        int n = arr.length;
        int i=0;
        List<Integer>l=new ArrayList<>(n);
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
        for(int index=0;index<n;index++)
        {
            if(arr[index]!=index+1)
            {
                l.add(index+1);
            }
        }
        return l;
    }
}

