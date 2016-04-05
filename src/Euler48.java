import java.math.*;

public class Euler48 
{
	public static void main(String[] args)
	{
		BigInteger val = new BigInteger("" + 0);
		
		for(int i = 1; i <= 1000; i++)
		{
			BigInteger temp = new BigInteger("" + i);
			temp = temp.pow(i);
			val = val.add(temp);
		}
		
		System.out.println(val);
	}	
}  