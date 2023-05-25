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
		
	}
}
