class Return_Value
{
	static int  add(int a,int b)
	throws Exception
	{
		try
		{
			int c=a/b;
			return c;
		}
		finally
		{
			System.out.println("I am Finally Blocked");
		}
	}
	public static void main(String arg[])
	{
		try
		{
			int result1=add(10,5);
			System.out.println("Result-1:"+result1);
			int result2=add(10,0);
			System.out.println("Result-2:"+result2);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Good Bye");
	}
}