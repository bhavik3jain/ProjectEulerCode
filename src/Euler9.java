public class Euler9 
{
	public static void main(String[] args)
	{
		int a = 0;
		int b = 0;
		int c = 0;
		
		for(int i = 0; i < 1000; i++)
		{
			for(int j = 0; j < 1000; j++)
			{
				for(int k = 0; k < 1000; k++)
				{
					if((i < j && i < k && j < k) && (i + j + k == 1000))
					{
						if((i * i) + (j*j) == (k * k))
						{
							System.out.println(i + " " + j + " " + k);
							System.out.println(i * j * k);
						}
					}
				}
			}
		} 
	}
}