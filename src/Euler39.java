import java.util.*;

public class Euler39 
{
	public static void main(String[] args)
	{
		int length = 120;
		int[] arr = new int[length];
		int counter = 0;
		
		for(int i = 1; i <= length; i++)
		{
//			System.out.println("here1: " + counter);
			for(int j = 1; j <= length; j++)
			{
				for(int k = 1; k <= length; k++)
				{
					for(int l = 1; l <= length; l++)
					{
						if((j + k + l == i) && ((j * j) + (k * k) == (l * l)))
						{
							System.out.println(i + " " + j + " " + k + " " + l);
							counter++;
						}
					}
				}
			}
			arr[i - 1] = counter;
//			System.out.println("here2: " + i + " " + counter);
			counter = 0;
		}
		
		Arrays.sort(arr);
		System.out.println(arr[length - 1]);
	} 
}