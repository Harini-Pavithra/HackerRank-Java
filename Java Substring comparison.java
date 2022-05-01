Problem
Given a string, s, and two indices, start and end, print a substring consisting of all characters in the inclusive range from start to end – 1. You’ll find the String class’ substring method helpful in completing this challenge.

Input Format
The first line contains a single string denoting s.
The second line contains two space-separated integers denoting the respective values of start and end.

Output Format
Print the substring in the inclusive range from start to end-1.

Sample Input
 Helloworld
 3 7

Sample Output
 lowo

Code:
import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String currentSubstring = s.substring(0,k);
        String smallest = currentSubstring;
        String largest = currentSubstring;
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int counter =1; counter<=s.length()-k;counter++)
        {
            String newString = s.substring(counter,counter+k);
            if(newString.compareTo(smallest)<0)
            {
                smallest = newString;
            }
            if(newString.compareTo(largest)>0)
            {
                largest = newString;
            }
            
        }
        
        
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
