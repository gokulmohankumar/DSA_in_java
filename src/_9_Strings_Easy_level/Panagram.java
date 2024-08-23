package _9_Strings_Easy_level;

import java.util.HashSet;
import java.util.Scanner;

public class Panagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<Character> hs = new HashSet<>();
        System.out.println("enter a string to check it is panagram or not");
        String s = in.nextLine();
        in.close();
        s = s.replace(" ", "").toLowerCase().trim();
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                hs.add(c);
            }
        }
        // Check if all 26 letters are present
        if (hs.size() == 26) {
            System.out.println("It is a panagram");
        } else {
            System.out.println("It is not a panagram");
        }
    }
}
