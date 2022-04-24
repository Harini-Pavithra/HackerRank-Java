Input Format
The first line contains an integer,q denoting the number of queries.Each line i of q subsequent lines contains three space-separated integers describing the respective

a,b,n values of query.


Output Format

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of n space-separated integers.

Sample Input

2
0 2 10
5 3 5
Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
Code:
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int temp;
            int aValue = a+b; // first value in the series(a+2^0.b)
            int bValue = aValue+2*b;// second value(a+2^0.2^1.b)
            int cValue;
            if(n==1)
            {
                System.out.println(aValue);
            }
            else
            {
            System.out.print(aValue +" "+bValue+" ");
            for(temp=2;temp<n;temp++)
            {
                cValue = bValue+(int)Math.pow(2,temp)*b;
                System.out.print(cValue +" ");
                bValue = cValue;
               
            }
            System.out.print('\n');
            }
        }
        in.close();
    }
}

