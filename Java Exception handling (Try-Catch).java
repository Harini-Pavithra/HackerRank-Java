Problem
You are required to compute the power of a number by implementing a calculator. Create a class MyCalculator which consists of a single method long power(int, int). This method takes two integers, n and p, as parameters and finds np. If either n or p is negative, then the method must throw an exception which says “ n or p should not be negative “. Also, if both n and p are zero, then the method must throw an exception which says “n or p should not be zero .“
For example, -4 and -5 would result in java.lang.Exception : n or p should not be negative.

Complete the function power in class MyCalculator and return the appropriate result after the power operation or an appropriate exception as detailed above.

Input Format
Each line of the input contains two integers, n and p. The locked stub code in the editor reads the input and sends the values to the method as parameters.

Constraint
-10 <= n <= 10
-10 <= p <= 10
Output Format
Each line of the output contains the result np, if both n and p are positive. If either n or p is negative, the output contains “n and p should be non-negative”. If both n and p are zero, the output contains “n and p should not be zero.”. This is printed by the locked stub code in the editor.

Sample Input
3 5
2 4
0 0
-1 -2
-1 3
Sample Output
 243
 16
 java.lang.Exception: n and p should not be zero.
 java.lang.Exception: n or p should not be negative.
 java.lang.Exception: n or p should not be negative.

Code:
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        
        try{
            int x = scan.nextInt();
            int y = scan.nextInt();
            System.out.println(x/y);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(InputMismatchException e)
        {
            System.out.println(e.getClass().getName());
        }
    }
}
