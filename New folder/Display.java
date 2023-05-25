abstract class Display
{
	public abstract void display();
	public void display2() 
	{
		System.out.println("Welcome");
	}
	
}
class Print extends Display
{
	public void display()
	{
		System.out.println("hello");
	}
	public static void main(String s[])
	{
		Print p=new Print();
		p.display2();
		p.display();
	}
}
/*
Abstract method:method which has only decleration doesnot have defination
Abstract class:a class which has atleast one abstract method
	object cannot be created for abstract class
Abstract method should be implemented in child class

*/

/* difference b/w interface and abstract class

abstract class					interface

1. it has methods with defination		1 it has all the methods only with declaration
   and methods with only declaration

2 object cannot be created			2. object can be created

3.methods with only declaration should 		3. methods are by default abstract
be explicitly decalred as abstract

						4. variables are by default constant
4. variables are not constant							ex: int i=10;  

*/