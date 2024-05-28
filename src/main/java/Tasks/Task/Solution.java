package Tasks.Task;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        char[] abc = word.toCharArray();
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        int z = 0;
        for(Character x : abc){
            if(Integer.valueOf(x) > z){
                z = Integer.valueOf(x);
            }
        }

        System.out.println(z);
    }
}