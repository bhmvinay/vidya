import java.util.Scanner;
class Fibo
{
	public static void main(String s[])
	{
		int n,a=0,b=0,c=1;
		Scanner d=new Scanner(System.in);
		System.out.println("enter a value of n:");
		n=d.nextInt();
		System.out.println("Fibonic series:");
		for(int i=1; i<=n; i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.print(a+" ");
		}
	}
}