import java.util.*;
import java.math.*;

public class Euler25 
{
	public static void main(String[] args)
	{
		BigInteger one = new BigInteger("" + 1);
		BigInteger two = new BigInteger("" + 1);
		BigInteger temp;
		for(int i = 3; i <= 10000; i++)
		{
			temp = new BigInteger("" + 0);
			temp = temp.add(one);
			temp = temp.add(two);
			String t = temp + "";
			if(t.length() == 1000)
			{
				System.out.println(i);
				break;
			}
			one = two;
			two = temp;
			
		}
	}
}