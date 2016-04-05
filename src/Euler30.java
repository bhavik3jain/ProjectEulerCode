public class Euler30 
{
	public static void main(String[] args)
	{
		int total = 0;
		
		for(int i = 2; i <= 10000000; i++)
		{
			String num = Integer.toString(i);
			int[] nums = new int[num.length()];
			for(int j = 0; j < num.length(); j++)
			{
				nums[j] = Integer.parseInt(Character.toString(num.charAt(j)));
			}
			int sum = 0;
			
			for(int k = 0; k < nums.length; k++)
			{
				sum = sum + (int)(Math.pow(nums[k], 5));
			}
			
			if(sum == i)
			{
				total = total + sum;
			}
		}
		System.out.println(total);
	} 
}