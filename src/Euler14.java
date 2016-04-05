public class Euler14 
{
	public static void main(String[] args)
	{
		long counter = 0;
		long maxCount = 0;
		long indexMax = 0;
		long number = 0;
		long flag = -1;
		
		for(long i = 1; i < 1000000; i++)
		{
			System.out.println(i);
			number = i;
			while(true)
			{
				if(number == 1)
				{
					flag = -10;
					counter++;
					break;
				}
				if(number % 2 == 0)
				{
					number = number / 2;
				}
				else if(number % 2 == 1)
				{
					number = (3 * number) + 1;
				}
				counter++;
			}
			if(counter > maxCount)
			{
				maxCount = counter;
				indexMax = i;
			}
		}
		
		System.out.println(indexMax + " " + maxCount);
	}  
}