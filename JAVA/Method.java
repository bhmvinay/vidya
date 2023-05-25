/*Example for method overloading*/
class Method
{
	public void add(int i,int j)
	{
		int m=i+j;
		System.out.println("m="+m);
	}
	public void add(double x,double y)
	{
		double n=x+y;
		System.out.println("n="+n);
	}
	public static void main(String s[])
	{
		Method e1=new Method();
		e1.add(10,20);
		e1.add(10.2,11.5);
	}
}