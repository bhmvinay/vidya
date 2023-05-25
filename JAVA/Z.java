class A
{
	int i=10,j=20,x;
	public void add()
	{
		x=i+j;
	}
}


class Z extends A
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
	public static void main(String s[])
	{
		Z e=new Z();
		e.add();
		e.sub();
		e.display();
	}
}