 /*
 Task
Given an integer. N. print its first 10 multiples. Each multiple N xi (where 1 ≤ i ≤10) should be printed on a new
line in the form: N x i = result.
Input Format
A single integer, N.
Constraints
• 2≤ N ≤20
Output Format
Print 10 lines of output; each line (where 1 ≤ i ≤10) contains the result of N x i in the form:
N x i = result.
Sample Input
2
Sample Output
2 x 12
2 x 2 4
2 x 36
2 x 4 8
2 x 510
2 x 6 12
2 x 714
2 x 816
2 x 918
2 x 10 20

  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class loop1 {
    
public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Reading the integer N from the input
        int N = Integer.parseInt(bufferedReader.readLine().trim());

        // Closing the BufferedReader
        bufferedReader.close();

        // Loop to generate and print the first 10 multiples of N
        for (int i = 1; i <= 10; i++) {
            // Printing each multiple in the format N x i = result
            System.out.println(N + " x " + i + " = " + (N * i));
        }
    }
}
