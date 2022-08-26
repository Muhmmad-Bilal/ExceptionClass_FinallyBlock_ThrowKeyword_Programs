import java.io.*;
class File_Input_Final
{
	public static void main(String arg[])
	throws Exception
	{
		FileInputStream file=null;
		try
		{
			file=new FileInputStream("abc.txt");
			int size=file.available();
			byte data[]=new byte[size];
			file.read(data,0,size);
			System.out.write(data,0,size);
		}
		finally
		{
			if(file!=null)
			{
				file.close();
			}
			System.out.println("\nI am Finally Block");
		}
		System.out.println("Good bye");
	}
}