import java.math.*;

public class Euler16 
{
	public static void main(String[] args)
	{
		int sum = 0;
		int exponent = 1000;
		BigInteger base = new BigInteger("2");
		BigInteger num = base.pow(exponent);
		String s = "" + num;
		
		for(int i = 0; i < s.length(); i++)
		{
			sum = sum + Integer.parseInt(Character.toString(s.charAt(i)));
		}
		
		System.out.println(sum);
		
	}
}