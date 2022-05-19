You are given a phone book that consists of people's names and their phone number. After that, you will be given some person's name as a query. For each query, print the phone number of that person.

Code:
//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        Map<String,Integer> map = new HashMap<>(n);
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            map.put(name,phone);
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            try
            {
                int contact = map.get(s);
                System.out.println(s+"="+contact);
            }
            catch(Exception e)
            {
                System.out.println("Not found");
            }
            
        }
    }
}
