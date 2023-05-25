class Exp
{
	public static void main(String s[])
	{
		byte a=20,b=10;
		a++;
		byte x1=a++;
		byte x2=++a;
		System.out.println("the value of a="+a+"and b="+b);
		System.out.println("the value of x1="+x1+"and x2="+x2);

		double m=5.2,n=6.2;
		double add=m+n;
		System.out.println("the value of m="+m+"and n="+n);
		System.out.println("the sum is="+add);

		int i=20,j=20;
		int sum=i+j;
		System.out.println("the value of i="+i+"and j="+j);
		System.out.println("the sum is="+sum);

		boolean x=true;
		if(x==true)
		{
			System.out.println("iam using boolean opeartor");
		}
		
		char name='m';
		System.out.println("charater name:   "+name);
		name++;
		System.out.println("charater name   "+name);
	}
}