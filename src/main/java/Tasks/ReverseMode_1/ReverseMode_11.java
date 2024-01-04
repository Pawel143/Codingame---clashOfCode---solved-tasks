package Tasks.ReverseMode_1;
import lombok.NoArgsConstructor;

import java.util.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
@NoArgsConstructor
 public class ReverseMode_11 {




    public static void  task() {
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