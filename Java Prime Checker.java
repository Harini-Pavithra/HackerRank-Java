You are given a class Solution and its main method in the editor.
Your task is to create a class Prime.
The class Prime should contain a single method checkPrime.

Code:
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import static java.lang.System.*;

class Prime
{
    public void checkPrime(int... array)
    {
        for(int counter=0;counter<array.length;counter++)
        {
            if(array[counter]<2)
            {
                
            }
            else if(array[counter]==2){
                System.out.print(array[counter]+" ");
            }
            else
            {
                int flag = 1;
                for(int counter1=2;counter1<array[counter];counter1++)
                {
                    if(array[counter]%counter1==0)
                    {
                        flag=0;
                        break;
                    }
                }
                if(flag==1)
                {
                    System.out.print(array[counter]+" ");
                }
            }
        }
        System.out.println();
    }
}
public class Solution {

    public static void main(String[] args) {
        try{
        BufferedReader br=new BufferedReader(new InputStreamReader(in));
        int n1=Integer.parseInt(br.readLine());
        int n2=Integer.parseInt(br.readLine());
        int n3=Integer.parseInt(br.readLine());
        int n4=Integer.parseInt(br.readLine());
        int n5=Integer.parseInt(br.readLine());
        Prime ob=new Prime();
        ob.checkPrime(n1);
        ob.checkPrime(n1,n2);
        ob.checkPrime(n1,n2,n3);
        ob.checkPrime(n1,n2,n3,n4,n5);  
        Method[] methods=Prime.class.getDeclaredMethods();
        Set<String> set=new HashSet<>();
        boolean overload=false;
        for(int i=0;i<methods.length;i++)
        {
            if(set.contains(methods[i].getName()))
            {
                overload=true;
                break;
            }
            set.add(methods[i].getName());
            
        }
        if(overload)
        {
            throw new Exception("Overloading not allowed");
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
