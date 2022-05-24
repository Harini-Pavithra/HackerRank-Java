A prime number is a natural number greater than  whose only positive divisors are  and itself. For example, the first six prime numbers are , , , , , and .

Given a large integer, , use the Java BigInteger class' isProbablePrime method to determine and print whether it's prime or  not prime.

Input Format

A single line containing an integer,  (the number to be checked).

Constraints

contains at most  digits.
Output Format

If  is a prime number, print prime; otherwise, print not prime.

Sample Input

13

Sample Output
prime

Code:

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



public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        //int n = scan.nextInt();
        BigInteger value = new BigInteger(scan.nextLine());
        boolean result = value.isProbablePrime(100);
        if(result == true)
        {
            System.out.println("prime");
        }
        else
        {
           System.out.println("not prime"); 
        }
    }
}
