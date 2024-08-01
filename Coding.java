class Coding
{
	public static void main(String args[])
	{
		char c='@';
		if(c>='0'&&c<='9')
			System.out.println("digit");
		else if(c>='A'&&c<='Z')
			System.out.println("upper");
		else if(c>='a'&&c<='z')
			System.out.println("lower");
		else
			System.out.println("symbols");
	}
}