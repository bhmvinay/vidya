class Exp
{
	public static void main(String s[])
	{
		String s1="kampli";
		String s2="BANGLORE";
		int i=s1.length();
		int j=s2.length();
		System.out.println("length:"+i);
		System.out.println("length:"+j);
		System.out.println("upper case:"+s1.toUpperCase());
		System.out.println("lower case:"+s2.toLowerCase());
		System.out.println("equals:"+s1.equals(s2));
		System.out.println("finding element usingindex:"+s1.indexOf(0));
		System.out.println("concation:"+s1.concat(" Government"));
		System.out.println("replace:"+s2.replace("BANGLORE","BELLARY"));
		if(i==j)
		{
			System.out.println("compare=s1 is same as s2.");
		}
		else
		{
			System.out.println("compare=s1 is not same as s2.");
		}
	}
}
