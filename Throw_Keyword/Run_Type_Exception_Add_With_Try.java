class Run_Type_Exception_Add_With_Try
{
	static	void add(int a,int b)
		{
			try
			{
				if(a<0||b<0)
				{
					RuntimeException e=new RuntimeException("Negative value is Invalid");
					throw e;
				}
			
			System.out.println("Addition is:"+(a+b));
			}catch(Exception e)
				{
					
					System.out.println("Error:"+e.getMessage());
				}
			
		}
		public static void main(String arg[])
		{
			add(10,5);
			add(100,50);
			add(100,-5);
			add(1000,500);
			System.out.println("Good Bye");
		}
}