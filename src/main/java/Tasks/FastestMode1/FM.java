package Tasks.FastestMode1;

import java.util.Scanner;

public class FM {

    /**
     * Auto-generated code below aims at helping you parse
     * the standard input according to the problem statement.
     **/

        public void task() {
            Scanner in = new Scanner(System.in);
            StringBuilder n = new StringBuilder(in.nextLine());

            char[] arr = n.toString().toCharArray();
            n = new StringBuilder();
            for (char x : arr) {
                if (x % 2 == 0) {
                    n.append("#");
                } else {
                    n.append("*");
                }
            }

            // Write an answer using System.out.println()
            // To debug: System.err.println("Debug messages...");

            System.out.println(n);
        }
    }

