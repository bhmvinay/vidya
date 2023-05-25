class A
{
	public void display1()
	{
		System.out.println("Polytechnic");
	}
}
interface B 
{
	public void display2();
}
class C extends A implements B
{
	public void display2()
	{
		System.out.println("hello");
	}
	public static void main(String s[])
	{
		C p=new C();
		p.display1();
		p.display2();
	}
}

/*

Interfaces:can be used to support multiple inheritance in java

interface is similar to class but all the methods have only declarations.
 all the methods in interface are by default abstact

parent class--> extends

parent interface --->implements

childclass extends class implements interface
{
}
*/