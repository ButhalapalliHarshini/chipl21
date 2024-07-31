class Cases
{
	public static void main(String args[])
	{
		char ch='z';
		switch(ch)
		{
			case 'a': System.out.println(ch + " vowels");
					  break;
			case 'e': System.out.println(ch + " vowels");
					   break;
			case 'i': System.out.println(ch + " vowels");
			          break;
			case 'o': System.out.println(ch + " vowels");
					   break;
			case 'u': System.out.println(ch + " vowels");
						break;
			default : System.out.println(ch + " consonant");
		}
	}
}