class Run_Type_Exception_Add_Withouy_Try
{
	static void add(int a,int b)
	{
		if(a<0||b<0)
		{
			RuntimeException e=new RuntimeException("Negative Value is Invalid");
			throw e;
		}
		System.out.println("Addition is:"+(a+b));
	}
	public static void main(String arg[])
	{
		add(10,5);
		add(100,50);
		add(10,-5);
		add(1000,5000);
	}
}