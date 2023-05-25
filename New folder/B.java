abstract class A
{
 public abstract void display();
 public void display2()
	{
	  System.out.println("hii");
	}
}
class B extends A
	{
	  public void display()
	{
	System.out.println("hello");
	}
 	public static void main(String s[])
	{
	B b=new b();
	b.display();
	b.display2();
	}
}
