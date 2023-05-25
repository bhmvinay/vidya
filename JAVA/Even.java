import java.util.Scanner;
class Even
{
	public static void main(String s[])
	{
		int i=1,n;
		System.out.println("Enter a limit of n");
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		System.out.println("odd numbers");
		while(i<=n)
		{
			if(i%2==0)
				{
					System.out.println(i);
				}
			i++;
		}
	}
}