package _9_Strings_Easy_level;

import java.util.Scanner;
import java.util.Stack;

public class ParanthesisChecking {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a string with paranthesis ex:[({}([]){})] to check it is balanced.");
        String str=in.next();
        if(isBalanced(str))
        {
            System.out.println(str+" is well formed / Balanced");
        }
        else {
            System.out.println(str+" is not Balanced");
        }
    }
    public static boolean isBalanced(String str)
    {
        Stack<Character>st=new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(st.empty())
            {
                st.push(ch);
            }
            else if(ch=='('||ch=='{'||ch=='[')
            {
                st.push(ch);
            }
            else if(ch=='}'&&st.peek()=='{')
            {
                st.pop();
            }
            else if(ch==')'&&st.peek()=='(')
            {
                st.pop();
            }
            else if(ch==']'&&st.peek()=='[')
            {
                st.pop();
            }
        }
        return st.empty();
    }
}
