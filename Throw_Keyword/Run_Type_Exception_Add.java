class Run_Type_Exception_Add
{
	static void add(int a,int b)
	throws RuntimeException
	{
		if(a<0||b<0)
		{
			RuntimeException e=new RuntimeException("Negative Value is Invalid");
			//Our Application detect the abnormal Condition
			throw e;
			
		}
		System.out.println("addition is:"+(a+b));
		
	}
	public static void main(String arg[])
	{
		
		add(10,5);
		add(100,50);
		add(1000,500);
		add(10,-5);//remaining program will not exciuted;
		add(10000,5000);//
	}
}