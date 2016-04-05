public class Euler37 
{
	public static void main(String[] args)
	{
		long sum = 0;
		long startingNumber = 10;
		int counter = 0;
		
		while(counter <= 10)
		{
			String temp = startingNumber + "";
			int t = 0;
			int flag = 0;
			int leftToRight[] = new int[temp.length()];
			int rightToLeft[] = new int[temp.length()];
			int total[] = new int[leftToRight.length + rightToLeft.length];
			
			for(int i = 0; i < leftToRight.length; i++)
			{
				leftToRight[i] = Integer.parseInt(temp.substring(i));
			}
			
			for(int i = 0; i < rightToLeft.length; i++)
			{
				rightToLeft[i] = Integer.parseInt(temp.substring(0, temp.length() - i));
			}
			
			for(int i = 0; i < leftToRight.length; i++)
			{
				total[i] = leftToRight[i];
			}
			
			for(int i = leftToRight.length; i < total.length; i++)
			{
				total[i] = rightToLeft[i - leftToRight.length];
			}
			
			for(int i = 0; i < total.length; i++)
			{
				if(Euler37.isPrime(total[i]) == false)
				{
					flag = -1;
					break;
				}
			}
			if(flag == -1)
			{
				startingNumber++;
			}
			else
			{
				System.out.println(startingNumber);
				sum = sum + startingNumber;
				startingNumber++;
				counter++;
			}
		}
		
		System.out.println(sum);
	} 
		
	public static boolean isPrime(int n)
	{
		if(n <= 1)
		{
			return false;
		}
		
		int m = 2;
		
		while(m * m <= n)
		{
			if(n % m == 0)
			{
				return false;
			}
			m++;
		}
		
		return true;
	}
}