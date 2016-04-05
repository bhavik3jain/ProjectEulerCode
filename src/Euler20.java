import java.math.*;

public class Euler20 
{
	public static void main(String[] args)
	{
		BigInteger num = new BigInteger(new String("1"));
		
		for(int i = 100; i >= 1; i--)
		{
			String val = "" + i;
			num = num.multiply(new BigInteger(val));
		}
		
		String str = "" + num;
		
		int[] arr = new int[str.length()];
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = Integer.parseInt(Character.toString(str.charAt(i)));
		} 
			
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			sum = sum + arr[i];
		} 
			
		System.out.println(sum);
	}
}  