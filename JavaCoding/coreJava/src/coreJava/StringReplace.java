package coreJava;

public class StringReplace
{

	static String replace(String s,char c1, char c2)
	{
		int l = s.length();
		char []arr = s.toCharArray();

		for (int i = 0; i < l; i++)
		{

			if (arr[i] == c1)
				arr[i] = c2;

			else if (arr[i] == c2)
				arr[i] = c1;
		}

		return String.valueOf(arr);
	}

	public static void main(String []args)
	{
		String s = "17.973,22";
		System.out.println("Original String "+s);
		char c1 = '.', c2 = ',';
		System.out.println(replace(s, c1, c2));
	}
}