Objective
Today, we will extend what we learned yesterday about Inheritance to Abstract Classes. Because this is a very specific object oriented concept, submissions are limited to the few languages that use this construct.

Task
Given a Book class and a Solution class, write a MyBook class that does the following:

Inherits from Book
Has a parameterized constructor taking these 3 parameters:
string title
string author
int price
Implements the Book class’ abstract display() method so it prints these  lines:
Title: , a space, and then the current instance’s title.
Author:, a space, and then the current instance’s author.
Price:, a space, and then the current instance’s price.

Input Format
You are not responsible for reading any input from stdin. The Solution class creates a Book object and calls the MyBook class constructor (passing it the necessary arguments). It then calls the display method on the Book object.

Output Format
The void display() method should print and label the respective title, author, and price of the MyBook object’s instance (with each value on its own line) like so:

Title: $title
Author: $author
Price: $price
Note: The $ is prepended to variable names to indicate they are placeholders for variables.

Sample Input

The following input from stdin is handled by the locked stub code in your editor:

The Alchemist
Paulo Coelho
248
Sample Output

The following output is printed by your display() method:
Title: The Alchemist
Author: Paulo Coelho
Price: 248

Code:
import java.util.*;
abstract class Book{
String title;
abstract void setTitle(String s);
String getTitle(){
return title;
}
}

//Write MyBook class here

class MyBook extends Book
{
    void setTitle(String s)
    {
        title = s;
    }
}

public class Main{
public static void main(String []args){
//Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
Scanner sc=new Scanner(System.in);
String title=sc.nextLine();
MyBook new_novel=new MyBook();
new_novel.setTitle(title);
System.out.println("The title is: "+new_novel.getTitle());
      sc.close();
}
}
