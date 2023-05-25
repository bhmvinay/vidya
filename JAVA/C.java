class A
{
	int i=10,j=20,x;
	public void add()
	{
		x=i+j;
	}
}


class B extends A
{
	int y;
	public void sub()
	{
		y=i-j;
	}
	public void display()
	{
		System.out.println("x="+x);
		System.out.println("y="+y);
	}
}

class C 
{
	public static void main(String s[])
	{
		B e=new B();
		e.add();
		e.sub();
		e.display();
	}
}