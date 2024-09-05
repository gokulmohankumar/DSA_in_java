package _1_FlowOfProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubsetsofArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of the Array");
        int n=in.nextInt();
        System.out.println("Enter the elements");
        int[]arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println("the subsets of the array");
        System.out.println(subsetsOfArray(arr));
    }

    //timecomplexity O(n*2^n)  | total number of subsets=2^n
    // Space complexity O(2^n*n)

    public static List<List<Integer>> subsetsOfArray(int[]arr)
    {
        List<List<Integer>>outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr)
        {
            int n=outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer>inList=new ArrayList<>(outer.get(i));
                inList.add(num);
                outer.add(inList);
            }
        }
        return outer;
    }
}
