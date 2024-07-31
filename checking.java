class Perfectsquare
{
	public static void main(String args[])
	{
		double num=23;
		double num1=Math.sqrt(num);
		System.out.println(num1);
		double num2=num1;
		if(num%num2==0)
			System.out.println("perfect square");
		else
			System.out.println("not a perfect square");
	}
}