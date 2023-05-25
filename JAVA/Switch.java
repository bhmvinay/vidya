Import java.util.Scanner;
public class Switchdemo
{
	public static void main(String[] args)
	{
		int day;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a day:\n");
		day=Input.nextInt();
		switch (day)
		{
			case 1:
				System.out.println("Monday");
				break;
			default:
			System.out.println("invalid option");
			break;
		}
	}
}