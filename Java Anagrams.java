Problem
Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description
Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a : the first string
string b : the second string
Returns
boolean: If a and b are case-insensitive anagrams, return true. Otherwise, return false.

Input Format
The first line contains a string a.
The second line contains a string b.

Sample Input 0
 anagram
 margana
Sample Output 0
 Anagrams

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b= b.toLowerCase();
        
        char[] c = a.toCharArray();
        char[] d = b.toCharArray();
        
        java.util.Arrays.sort(c);
        java.util.Arrays.sort(d);
        
        return java.util.Arrays.equals(c, d);
        
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
