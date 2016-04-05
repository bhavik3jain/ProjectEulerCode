public class Euler45 
{
	public static void main(String[] args)
	{
		int flag = -1;
		int one = 0;
		int two = 0;
		int three = 0;
		for(int i = 286; i <= 10000; i++)
		{
			one = Euler45.makeTri(i);
			for(int j = 166; j <= 10000; j++)
			{
				two = Euler45.makePent(j);
				for(int k = 144; k <= 10000; k++)
				{
					three = Euler45.makeHex(k);
					if(one == two && two == three && one == three)
					{
						System.out.println(i);
						System.out.println(j);
						System.out.println(k);
						flag = 1;
						break;
					}
				}
				if(flag == 1)
				{
					break;
				}
			}
			if(flag == 1)
			{
				break;
			}
		}
	}
	
	public static int makeTri(int n)
	{
		int sum = 0;
		
		sum = ((n * (n + 1)) / 2);
		
		return sum;
	}
	
	public static int makePent(int n)
	{
		int sum = 0;
		
		sum = ((n * ((3 * n) - 1)) / 2);
		
		return sum;
	}
	
	public static int makeHex(int n)
	{
		int sum = 0;
		
		sum = (n * ((2 * n) - 1));
		
		return sum;
	}
}