package Tasks.ifContains;

import java.util.*;


/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine().toLowerCase();
        String text = in.nextLine().toLowerCase();
        int count = 0;

        String[] arr = text.split(" ");
        for(String x : arr){
            if(x.contains(S)){
                count++;
            }
        }

        //for()
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(count);
    }
}
