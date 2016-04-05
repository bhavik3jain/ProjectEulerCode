import java.util.*;

public class Euler21 
{
	public static void main(String[] args)
	{
		int sum = 0;
		
		for(int i = 1; i <= 10000; i++)
		{
			if(Euler21.findAmicableNumber(i) == true)
			{
				sum = sum + i;
			}
		}
		
		System.out.println(sum);
	}
	
	public static boolean findAmicableNumber(int n)
	{
		ArrayList<Integer> one = new ArrayList<Integer>();
		ArrayList<Integer> two = new ArrayList<Integer>();
		int total1 = 0;
		int total2 = 0;
		
		for(int j = 1; j < n; j++)
		{
			if(n % j == 0)
			{
				one.add(j);
			}
		}
		
		for(int j = 0; j < one.size(); j++)
		{
			total1 = total1 + one.get(j);
		}
		
		for(int j = 1; j < total1; j++)
		{
			if(total1 % j == 0)
			{
				two.add(j);
			}
		}
		
		for(int j = 0; j < two.size(); j++)
		{
			total2 = total2 + two.get(j);
		}
		
		if(n == total2 && total1 != total2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}