package Tasks.ReverseMode_001;

import java.util.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");


        for(int i = 0; i< s.length(); i++){
            if(Character.isLetter(s.charAt(i)) || s.charAt(i) == ' '){
                System.out.print(s.charAt(i));
            }
        }
    }
}