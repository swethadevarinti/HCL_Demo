// Java program to print all the permutations
// of the given string
public class StringPermutations {
	
	static int count =0;
	static void printPermutn(String str, String ans)
	{
		
		if (str.length() == 0) {
			char ch = ans.charAt(0);
			if(Character.isUpperCase(ch)) {
				count++;
				System.out.println("------printPermutn----for----"+str+"-----------"+ans+"---------------------FINAL---------"+count);
			}
			
			return;
		}

	
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			// Recursive call
			printPermutn(ros, ans + ch);
		}
	}

	// Driver code
	public static void main(String[] args)
	{
		String s = "raHUI";
		printPermutn(s, "");
	}
}
