import java.util.Arrays;

public class StringOccurences {
	
	public static int getLargest(int[] a, int total){  
		for (int element: a) {
            System.out.println(element);//to print array
        }	
		Arrays.sort(a);  
        	
		return a[total-1];  
		
		}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String word ="abcabcabc";
		char search = 'a';
		int count = 0;
		for(int i=0;i<word.length();i++) {
			
			if(word.charAt(i) == search){
				count++;
			}
			
		}
		
		System.out.println("count:::::::::::::"+count);
		
		int a[]={1,2,5,6,3,2,6};  
		int b[]={44,66,99,77,33,22,55}; 
		System.out.println(Arrays.toString(a));
		System.out.println("Largest: "+getLargest(a,6));  

		
		int arry[] = {26, 98, 1918, 2825,2825};
	    int max = Arrays.stream(arry).max().getAsInt();
	    System.out.println("Largest Element is: " + max);
	    
	    int secmax = Arrays.stream(arry).sorted().distinct().skip(1).max().getAsInt();
	    System.out.println("Largest Element is: " + secmax);
	    
	    
	    
	    String str = "hello world!";

	 // capitalize first letter
	 String output = str.substring(0, 1).toUpperCase() + str.substring(1);

	 // print the string
	 System.out.println("output:::::::"+output);

	}

}
