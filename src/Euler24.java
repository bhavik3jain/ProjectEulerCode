import java.util.*;

public class Euler24 
{
	public static void main(String[] args)
	{
		int totalPerm = 1;
		ArrayList<String> ar = new ArrayList<String>();
			
		String[] str = new String[9];
		str[0] = "" + 0;
		str[1] = "" + 1;
		str[2] = "" + 9;
		str[3] = "" + 3;
		str[4] = "" + 4;
		str[5] = "" + 5;
		str[6] = "" + 6;
		str[7] = "" + 7;
		str[8] = "" + 8;
//		str[9] = "" + 9;

		
		for(int i = 1; i <= str.length; i++)
		{
			totalPerm = totalPerm * i;
		}
		ar.add("");
		System.out.println("here1");
		while(ar.size() <= 10000000)//totalPerm)//for(int i = 0; i < totalPerm - 1; i++)
		{
			Euler24.shuffle(str);
			String temp = "2";
			for(int j = 0; j < str.length; j++)
			{
				temp = temp + str[j];
			}
			
			if(temp.charAt(0) == '2')
			{
				ar.add(temp);
			}
		}
		System.out.println("here2");
		ar.remove(0);
		
		String[] list = new String[ar.size()];
		
		for(int i = 0; i < list.length; i++)
		{
			list[i] = "" + ar.get(i);
		}
		
		Arrays.sort(list);
		
		ArrayList<String> newArr = new ArrayList<String>();
		System.out.println("here3");
		for(int i = 0; i < list.length; i++)
		{
			newArr.add(list[i]);
		}
		System.out.println("here4");
		System.out.println(newArr.size());
		for(int i = 0; i < newArr.size() - 1; i++)
		{
			if(newArr.get(i).equals(newArr.get(i + 1)))
			{
				System.out.println(newArr.get(i + 1));
				newArr.remove(i + 1);
			}
			i = 0;
		}
		System.out.println("here5");
		System.out.println(newArr.size());
		
//		System.out.println(list[1000000] + " " + list[999999]);
		
	}
	
	public static void shuffle(String[] a)
    {
    	int n = a.length;
		while(n > 1)
		{
			int k = (int) (Math.random() * n);
			String temp = a[n-1];
			a[n-1] = a[k];
			a[k] = temp;
			n--;
		}
	}

	
}