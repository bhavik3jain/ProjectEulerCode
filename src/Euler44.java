import java.util.*;

public class Euler44 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int one = 0;
		int two = 0;
		int smalldiff = 0;
		int diff = 0;
		int sum = 0;
		
		for(int i = 0; i < 1000; i++)
		{
			arr.add(Euler44.makePent(i + 1));
		}
		
		for(int i = 0; i < arr.size(); i++)
		{
			one = arr.get(i);
			for(int j = 0; j < arr.size(); j++)
			{
				two = arr.get(j);
				sum = one + two;
				diff = Math.abs(one - two);
				smalldiff = diff;
				
				int i1 = arr.indexOf((Integer) sum);
				int i2 = arr.indexOf((Integer) diff);
				
				if(i2 != -1 && i2 != -1)
				{
					if(diff <= smalldiff)
					{
						smalldiff = diff;
					}
				}
			}
		}
		
		System.out.println(one + " " + two + " " + smalldiff);
		
	}
	
	public static int makePent(int n)
	{
		int val = 0;
		
		val = ((n * ((3 * n) - 1)) / 2);
		
		return val;
	}
}