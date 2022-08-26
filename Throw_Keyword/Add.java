class Add
{
	static void add(int a,int b)
	throws Exception{
		if(a<0 || b<0)//Our application detect the abnormal Condition
		{
			Exception e=new Exception("Negative value is Invalid");
			throw e;
		}
		System.out.println(a+b);
		
		
	}
	public static void main(String arg[])
	{
		try
		{		add(10,5);
		add(100,50);
		add(1000,500);
		add(10000,-5);//Exception will thrown remaing lines of try-block will not run,
		add(1,2);
		}catch(Exception e)
		{
		e.printStackTrace();
		}
	}
}