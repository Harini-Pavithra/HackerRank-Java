A subarray of an -element array is an array composed from a contiguous block of the original array's elements. For example, if , then the subarrays are , , , , , and . Something like  would not be a subarray as it's not a contiguous subsection of the original array.
The sum of an array is the total sum of its elements.
An array's sum is negative if the total sum of its elements is negative.
An array's sum is positive if the total sum of its elements is positive.
Given an array of  integers, find and print its number of negative subarrays on a new line.

Input Format

The first line contains a single integer, , denoting the length of array .
The second line contains  space-separated integers describing each respective element, , in array .

Output Format

Print the number of subarrays of  having negative sums.

Sample Input

5
1 -2 4 -5 1

Sample Output
9

Code:
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int sum =0,count=0;
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int[] array = new int[number];
        for(int counter=0;counter<number;counter++)
        {
            array[counter]=scan.nextInt();
        }
        for(int counter=0;counter<number;counter++)
        {
            sum =0;
            for(int counter1=counter;counter1<number;counter1++)
            {
                sum = sum + array[counter1];
                if(sum<0)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
