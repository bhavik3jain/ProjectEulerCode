import java.util.*;

public class Euler52 
{
	public static void main(String[] args)
	{
		boolean test = true;
		int number = 1;
		int x2;
		int x3;
		int x4;
		int x5;
		int x6;
		boolean tf = true;
		while(tf)
		{
			x2 = 2 * number;
			x3 = 3 * number;
			x4 = 4 * number;
			x5 = 5 * number;
			x6 = 6 * number;
			
			String xx1 = Integer.toString(number);
			String xx2 = Integer.toString(x2);
			String xx3 = Integer.toString(x3);
			String xx4 = Integer.toString(x4);
			String xx5 = Integer.toString(x5);
			String xx6 = Integer.toString(x6);
			
			String[] arr1 = new String[xx1.length()];
			String[] arr2 = new String[xx2.length()];
			String[] arr3 = new String[xx3.length()];
			String[] arr4 = new String[xx4.length()];
			String[] arr5 = new String[xx5.length()];
			String[] arr6 = new String[xx6.length()];
			
			for(int i = 0; i < arr1.length; i++)
			{
				arr1[i] = Character.toString(xx1.charAt(i));
			}
			
			for(int i = 0; i < arr2.length; i++)
			{
				arr2[i] = Character.toString(xx2.charAt(i));
			}
			
			for(int i = 0; i < arr3.length; i++)
			{
				arr3[i] = Character.toString(xx3.charAt(i));
			}
			
			for(int i = 0; i < arr4.length; i++)
			{
				arr4[i] = Character.toString(xx4.charAt(i));
			}
			
			for(int i = 0; i < arr5.length; i++)
			{
				arr5[i] = Character.toString(xx5.charAt(i));
			}
			
			for(int i = 0; i < arr6.length; i++)
			{
				arr6[i] = Character.toString(xx6.charAt(i));
			}
			
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			Arrays.sort(arr3);
			Arrays.sort(arr4);
			Arrays.sort(arr5);
			Arrays.sort(arr6);
			
			for(int i = 0; i < arr1.length; i++)
			{
				if(arr1[i].equals(arr2[i]) && arr2[i].equals(arr3[i]) && arr3[i].equals(arr4[i]) 
							&& arr4[i].equals(arr5[i]) && arr5[i].equals(arr6[i]) && arr6[i].equals(arr1[i]))
				{
					test = true;
				}
				else
				{
					test = false;
					break;
				}
			}
			
			if(test == true)
			{
				System.out.println(number);
				tf = false;
			}
			else
			{
				tf = true;
				System.out.println(number);
				number++;
			}
		}
	}
}