In computer science, a stack or LIFO (last in, first out) is an abstract data type that serves as a collection of elements, with two principal operations: push, which adds an element to the collection, and pop, which removes the last element that was added.(Wikipedia)
A string containing only parentheses is balanced if the following is true: 1. if it is an empty string 2. if A and B are correct, AB is correct, 3. if A is correct, (A) and {A} and [A] are also correct.

Examples of some correctly balanced strings are: "{}()",  "[{()}]",  "({()})"

Examples of some unbalanced strings are: "{}(",  "({)}",  "[[",  "}{" etc.

Given a string, determine if it is balanced or not.

Input Format

There will be multiple lines in the input file, each having a single non-empty string. You should read input till end-of-file.

The part of the code that handles input operation is already provided in the editor.

Output Format

For each case, print 'true' if the string is balanced, 'false' otherwise.

Sample Input

{}()
({()})
{}(
[]
Sample Output

true
true
false
true

Code:

import java.util.*;

class Solution{
    public static boolean isSolvable(String S)
{
    Stack<Character> stack = new Stack();
    for(int counter=0;counter<S.length();counter++)
    {
        char ch = S.charAt(counter);
        if(ch=='(' || ch == '{' || ch=='[')
        {
            stack.push(ch);
        }
        else {
            if(stack.isEmpty())
            {
                return false;
            }
            else
            {
               char pop_value = stack.pop(); 
               if((ch == ')' && pop_value !='(')||(ch == '}' && pop_value !='{') || ch == ']' && pop_value !='[')
               {
                   return false;
               }
            }
        }
    }
    if(stack.isEmpty())
    {
        return true;
    }
    else
    {
        return false;
    }
}
    
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            String input=sc.next();
            //Complete the code
            boolean result = isSolvable(input);
            System.out.println(result);
        }
        
    }
}
