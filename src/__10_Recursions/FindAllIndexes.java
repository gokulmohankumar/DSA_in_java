package __10_Recursions;

import java.util.ArrayList;
import java.util.Scanner;

public class FindAllIndexes {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=in.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the target element to check present or not");
        int k= in.nextInt();
        //method 1
        System.out.println("method 1 : returning static list: ");
        findAllIndexes(arr,k,0);
        System.out.println(al.toString());
        //method 2
        ArrayList<Integer>myList=new ArrayList<>();
        System.out.println("Method 2 returning list passed from arguement : \n"+findAllIndexesII(arr,k,myList,0).toString());
        //method 3
        System.out.println("Method 3 returning functional scope List: \n"+ findAllIndexesIII(arr,k,0));
    }
      static ArrayList<Integer>al=new ArrayList<>();
    public static void findAllIndexes(int[]arr,int k,int i)
    {
        if(i>arr.length-1)
        {
            return;
        }
        if(arr[i]==k)
        {
            al.add(i);
        }
        findAllIndexes(arr,k,i+1);
    }
    //Alternative - returning list
    static ArrayList<Integer> findAllIndexesII(int[]arr,int k,ArrayList<Integer> myList, int i)
    {
        if(i>arr.length-1)
        {
            return myList;
        }
        if(arr[i]==k)
        {
            myList.add(i);
        }
        return findAllIndexesII(arr,k,myList,i+1);
    }
    //Method 3 returning an arrayList without passing list arguements or using static lists.
    static ArrayList<Integer> findAllIndexesIII(int[]arr,int k,int i)
    {
        ArrayList<Integer>inList=new ArrayList<>();
        if(i>arr.length-1)
        {
            return inList;
        }
        if(arr[i]==k)
        {
            inList.add(i);
        }
        ArrayList<Integer> fromBelow=findAllIndexesIII(arr,k,i+1);
        inList.addAll(fromBelow);
        return inList;
    }
}
