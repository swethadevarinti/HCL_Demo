	import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class ArraysComparison {



	public static Integer[] removeDuplicates(Integer[] a)
	{
		LinkedHashSet<Integer> set    = new LinkedHashSet<Integer>();
		// adding elements to LinkedHashSet
		for (int i = 0; i < a.length; i++)
			set.add(a[i]);
		System.out.print(set);

		int n = set.size();
		Integer arr[] = new Integer[n];

		int i = 0;
		for (Integer x : set)
			arr[i++] = x;
		return arr;


	}


	public static void main(String[] args) {

		Integer[] arr = {1,2,3,2,1};
		Integer[] arr1 = {3,2,1,3};
		Integer[] arr2 = {1,2,3,4};

		Integer[] array = removeDuplicates(arr);
		Integer[] array1 = removeDuplicates(arr1);
		Integer[] array2 = removeDuplicates(arr2);
		
		Collections.sort(Arrays.asList(array));
		Collections.sort(Arrays.asList(array1));
		
		boolean retval = Arrays.equals(array, array1);
		System.out.println("arr and arr1 are: " + retval);
		
		boolean retval2 = Arrays.equals(array, array2);
		System.out.println("arr and arr2 are: " + retval2);
		

	}

}
