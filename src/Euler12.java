public class Euler12 
{
	public static void main(String[] args)
	{
		int counter = 0;
		int sum = 0;
		
		for(int i = 1; i < 100000; i++)
		{
			sum = sum + i;
			for(int j = 1; j <= sum; j++)
			{
				if(sum % j == 0)
				{
					counter++;
					if(counter == 500)
					{
						System.out.println(sum);
						break;
					}
				}
			}
		}
	} 
}