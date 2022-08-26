class BellLabsException extends Exception
{
	BellLabsException(String msg)
	{
		super(msg);
	}
}
class Calc
{
	static int add(int a,int b)
	throws Exception
	{
	if(a<0||b<0)	
	{
		
		BellLabsException e=new BellLabsException("Negative value is Invalid");
		throw e;
	}
		int c=a+b;
		return c;
		
	}
}
class Add_CheckedUserDefinedCustomException
{
	public static void main(String arg[])
	{
		
		try
		{
		int a=Calc.add(10,5);
		System.out.println("a="+a);
		int b=Calc.add(100,50);
		System.out.println("b="+b);
		int c=Calc.add(100,-50);
		System.out.println("c="+c);
		int d=Calc.add(1000,200);
		System.out.println("d="+d);
		}
		catch(BellLabsException e)
		{
			e.printStackTrace();
			}
	}
	
}