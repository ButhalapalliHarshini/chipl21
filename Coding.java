class Coding
{
	public static void main(String args[])
	{
		char c='@';
		if(c>='0'&&c<='9')
			System.out.println("digits");
		else if(c>='A'&&c<='Z')
			System.out.println("uppers");
		else if(c>='a'&&c<='z')
			System.out.println("lower");
		else
			System.out.println("symbols");
	}
}