package Tasks.ReverseMode_1;
import java.util.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class ReverseMode_1 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
            int X = in.nextInt();
            System.out.println(Integer.toBinaryString(X));
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");


    }
}