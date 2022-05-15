You are given a  2D array. An hourglass in an array is a portion shaped like this:

a b c
  d
e f g
For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
Actually, there are many hourglasses in the array above. The three leftmost hourglasses are the following:

1 1 1     1 1 0     1 0 0
  1         0         0
1 1 1     1 1 0     1 0 0
The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.

In this problem you have to print the largest sum among all the hourglasses in the array.

Input Format

There will be exactly  lines, each containing  integers seperated by spaces. Each integer will be between  and  inclusive.

Output Format

Print the answer to this problem on a single line.

Sample Input

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
Sample Output

19

Code:

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int row,col,sum=0,max=-63;
        int[][] array = new int[6][6];
        for(row=0;row<6;row++)
        {
            for(col=0;col<6;col++)
            {
                array[row][col]=scan.nextInt();
            }
        }
        
        for(row=0;row<=3;row++)
        {
            for(col=0;col<=3;col++)
            {
                sum = array[row][col]+array[row][col+1]+array[row][col+2]+
                array[row+1][col+1]+array[row+2][col]+array[row+2][col+1]+
                array[row+2][col+2];
                if(sum >= max)
                {
                    max=sum;
                }
                
            }
        }
        System.out.println(max);
    }
}
