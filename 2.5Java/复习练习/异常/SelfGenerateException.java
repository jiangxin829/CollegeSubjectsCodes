public class SelfGenerateException extends Exception
{
	SelfGenerateException(String msg)
	{
		super(msg);
	}
	static void throwtest()throws SelfGenerateException
	{
		int a=1;
		if(a==1)
		{
			throw new SelfGenerateException("aΪ1!");
		}
	}
	public static void main(String args[])
	{
		try 
		{
			throwtest();
		}catch(SelfGenerateException e)
		{
			e.printStackTrace();
		}
	}
}