import java.io.*; 
class Byte
{
	static byte[] read()
	throws Exception
	{
		FileInputStream file=null;
		
			try
			{
				file=new FileInputStream("abc.txt");
				int size=file.available();
				byte data[]=new byte[size];
				file.read(data,0,size);
				return data;
			}
			finally
			{
				if(file!=null)
				{
					file.close();
				}
				System.out.println("I am finally blocked");
			}
		
	}
}
class Input_File_Byte
{
	public static void main(String arg[])
	{
		try
		{
			byte data[]=Byte.read();
			String str=new String(data,0,data.length);
			System.out.println(str);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Good Bye");
	}
}










