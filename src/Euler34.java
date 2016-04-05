public class Euler34 
{
	public static void main(String[] args)
	{
		int totalSum = 0;
		
		for(int i = 3; i <= 1000000; i++)
		{
			int sum = 0;
			String val = "" + i;
			int arr[] = new int[val.length()];
			
			for(int j = 0; j < arr.length; j++)
			{
				arr[j] = Integer.parseInt(Character.toString(val.charAt(j)));
			}
			
			for(int k = 0; k < arr.length; k++)
			{
				sum = sum + Euler34.mathFactorial(arr[k]);
			}
			
			if(sum == i)
			{
				totalSum = totalSum + sum;
			}
		}
		
		System.out.println(totalSum);
	}
	
	public static int mathFactorial(int n)
	{
		int values = 1;
		
		for(int i = 1; i <= n; i++)
		{
			values = values * i;
		}
		
		return values;
	}
}