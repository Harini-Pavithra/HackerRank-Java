Problem
When a method in a subclass overrides a method in superclass, it is still possible to call the overridden method using super keyword. If you write super.func() to call the function func(), it will call the method that was defined in the superclass.

You are given a partially completed code in the editor. Modify the code so that the code prints the following text:
Hello I am a motorcycle, I am a cycle with an engine.
 My ancestor is a cycle who is a vehicle with pedals.
Super Keyword in java
The super keyword in java is a reference variable which is used to refer immediate parent class object.
Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable.
Usage of Java Super Keyword
super can be used to refer immediate parent class instance variable.
super can be used to invoke immediate parent class method.
super() can be used to invoke immediate parent class constructor.

Code:
import java.util.*;
import java.io.*;


class BiCycle{
String define_me(){
return "a vehicle with pedals.";
}
}

class MotorCycle extends BiCycle{
String define_me(){
return "a cycle with an engine.";
}
MotorCycle(){
System.out.println("Hello I am a motorcycle, I am "+ define_me());

String temp= super.define_me(); //Fix this line

System.out.println("My ancestor is a cycle who is "+ temp );
}
}
class Solution{
public static void main(String []args){
MotorCycle M=new MotorCycle();
}
}
