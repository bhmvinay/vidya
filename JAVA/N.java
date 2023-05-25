class V
{
	int i=10,j=20,x;
}

class N extends V
{
	public void display()
	{
		int x;
		x=i+j;
		System.out.println("x="+x);
	}
	public static void main(String s[])
	{
		N e=new N();
		e.display();
	}
}