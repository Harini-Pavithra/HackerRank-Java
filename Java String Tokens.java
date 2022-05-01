Problem 

Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.

Note: You may find the String.split method helpful in completing this challenge.

Input Style

A single string,s .

Output Format

On the first line, print an integer,n , denoting the number of tokens in string s  (they do not need to be unique). Next, print each of the n tokens on a new line in the same order as they appear in input string.

Sample Input

He is a very very good boy, isn't he?

Sample Output

10
He
is
a
very
very
good
boy
isn
t
he

Code:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.trim();
        if(s.length() ==0)
        {
            System.out.println(0);
            return;
        }
        String[] words = s.split("[^a-zA-Z]+");
        System.out.println(words.length);
        for(String word:words)
        {
            System.out.println(word);
        }
        scan.close();
    }
}
