
class Exp1
{
	public static void main(String s[])
	{
	
		int i=10,j=0,x;
		try
		{
			x=i/j;
			System.out.println("x="+x);
		}
		catch(Exception e)
		{
			System.out.println("exception="+e);	
			System.out.println("hello");
		}
	}
}