For this problem, we have  types of queries you can perform on a List:

Insert  at index :
Insert x y

Delete the element at index :
Delete x

Given a list, , of  integers, perform  queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.

Input Format

The first line contains an integer,  (the initial number of elements in ).
The second line contains  space-separated integers describing .
The third line contains an integer,  (the number of queries).
The  subsequent lines describe the queries, and each query is described over two lines:

If the first line of a query contains the String Insert, then the second line contains two space separated integers , and the value  must be inserted into  at index .
If the first line of a query contains the String Delete, then the second line contains index , whose element must be deleted from .

Output Format

Print the updated list  as a single line of space-separated integers.

Sample Input

5
12 0 1 78 12
2
Insert
5 23
Delete
0
Sample Output

0 1 78 12 23

Code:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int counter;
        int number = scan.nextInt();
        List list = new ArrayList();
        for(counter=0;counter<number;counter++)
        {
             int value = scan.nextInt();
             list.add(value);
        }
        int queries = scan.nextInt();
        for(counter=0;counter<queries;counter++)
        {
            String operation = scan.next();
            if(operation.equals("Insert"))
            {
                int x = scan.nextInt();
                int y = scan.nextInt();
                list.add(x,y);
            }
            else if(operation.equals("Delete"))
            {
                int z = scan.nextInt();
                list.remove(z);
            }
        }
        for(counter=0;counter<list.size();counter++)
        {
            System.out.print(list.get(counter)+" ");
        }
        
    }
}
