class Return_Value2
{
	static int add(int a,int b)
	{
	try
	{
		int c=a/b;
		return c;
	}	
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		System.out.println("I am Finally Block");
	}
	return -1;
	}
	public static void main(String arg[])
	{
		int result1=add(100,5);
		System.out.println("Result-1:"+result1);
		int result2=add(100,0);
		System.out.println("Result-2:"+result2);
	}
}