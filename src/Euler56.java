import java.math.*;

public class Euler56 
{
	public static void main(String[] args)
	{
		int sum = 0;
		
		for(int a = 1; a < 100; a++)
		{
			for(int b = 1; b < 100; b++)
			{
				int temp = 0;
				BigInteger bi = new BigInteger("" + a);
				bi = bi.pow(b);
				String str = bi + "";
				
				int[] arr = new int[str.length()];
				
				for(int i = 0; i < str.length(); i++)
				{
					arr[i] = Integer.parseInt(Character.toString(str.charAt(i)));
				}
				
				for(int i = 0; i < arr.length; i++)
				{
					temp = temp + arr[i];
				}
				
				if(temp > sum)
				{
					sum = temp;
				}
			}
		}
		System.out.println(sum);
	} 
}