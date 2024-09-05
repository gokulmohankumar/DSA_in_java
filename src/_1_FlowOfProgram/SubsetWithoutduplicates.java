package _1_FlowOfProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetWithoutduplicates {
    public static void main(String[] args) {
        int []arr={1,2,2};
        System.out.println(subsetsOfArray(arr));
    }
    public static List<List<Integer>> subsetsOfArray(int[]arr)
    {
        Arrays.sort(arr);
        int start=0;
        int end=0;
        List<List<Integer>>outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int j=0;j<arr.length;j++)
        {
            if(j>0 && arr[j]==arr[j-1]) {
                start = end + 1;
            }
            end= outer.size()-1;
                int n = outer.size();
                for (int i = start; i < n; i++) {
                    List<Integer> inList = new ArrayList<>(outer.get(i));
                    inList.add(arr[j]);
                    outer.add(inList);
                }
        }
        return outer;
    }
}
