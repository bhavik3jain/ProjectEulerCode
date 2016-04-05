import java.util.*;
import java.io.*;

public class Euler22 
{
	public static void main(String[] args)
	{
		ArrayList<String> aL = new ArrayList<String>();
		ArrayList<String> temp = new ArrayList<String>();
		ArrayList<String> alpha = new ArrayList<String>();
		int sum = 0;
		String f1 = "Euler22.txt";
  		File file1 = new File(f1); 
  		Scanner input1 = null;
  		String str1 = "";
  		
	 	try 
		{ 
			input1 = new Scanner(file1); 
		} 
		catch (FileNotFoundException ex1) 
		{
			System.out.println("*** Cannot open the files ***"); 
			System.exit(1); // Quit the program 
		}
		
		while(input1.hasNextLine() == true)
		{
			str1 = input1.nextLine();
		}
		
		str1 = str1 + ",";
		
		while(str1.length() > 0)
		{
			int loc = str1.indexOf(',');
			String s = "";
			s = str1.substring(0, loc);
			temp.add(s);
			str1 = str1.substring(loc + 1);
		}
		
		for(int i = 0; i < temp.size(); i++)
		{
			String st = temp.get(i);
			int two = st.lastIndexOf('"');
			st = st.substring(1, two);
			aL.add(i, st);
		}

		String[] strings = new String[aL.size()];
		
		for(int i = 0; i < aL.size(); i++)
		{
			strings[i] = aL.get(i);
		}
		
		Arrays.sort(strings);
		
		for(int i = 0; i < strings.length; i++)
		{
			alpha.add(strings[i]);
		}
		
		
		for(int i = 0; i < alpha.size(); i++) //alpha.size(); i++)
		{
			int value = 0;
			int index = i + 1;
			String n = alpha.get(i);
			for(int j = 0; j < n.length(); j++)
			{
				int v = Character.getNumericValue(n.charAt(j)) - 9;
				value = value + v;
			}
			value = value * index;
			sum = sum + value;
		}
		
		System.out.println(sum);
		
	}
}