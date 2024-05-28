package Tasks.FastestMode1;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    public static void main(String[] args) {

        List aa = new ArrayList();

        aa.add(3);
        aa.add(2);
        aa.add(3);
        aa.add(5);
        System.out.println(getMaxValue(aa));
    }

    /*
     * Complete the 'getMaxValue' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
Scanner sc = new Scanner(System.in);
    public static int getMaxValue(List<Integer> arr) {
        // Write your code here

        Collections.sort(arr);
        long[] longNumbers = new long[]{100000000001L, 100000000002L, 100000000003L};

        while (arr.get(0) > 1){
            for (int i = 0; i< arr.size(); i++){
                arr.set(i, arr.get(i)-1);
            }
        }

        return arr.get(arr.size()-1);

    }

}

 class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.getMaxValue(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
