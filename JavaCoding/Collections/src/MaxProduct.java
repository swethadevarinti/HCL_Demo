import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MaxProduct {

	public static void findMaximumProduct(int[] A)
	{
		if (A.length < 2) {
			return;
		}

		int max_product = Integer.MIN_VALUE;
		int max_i = -1, max_j = -1;

		for (int i = 0; i < A.length - 1; i++)
		{
			for (int j = i + 1; j < A.length; j++)
			{
				if (max_product < A[i] * A[j])
				{
					max_product = A[i] * A[j];
					max_i = i;
					max_j = j;
				}
			}
		}
		System.out.println("  max1 :"+ A[max_i] +"   max2  :"+A[max_j]);
	}

	public static void findMaximumProduct(List<Integer> list){

		list = (List<Integer>) list.stream().sorted(Collections.reverseOrder()).limit(2).collect(Collectors.toList());

		System.out.println("  max1 :"+list.get(0)+"   max2  :"+list.get(1));
	}


	public static void main(String[] args) {

		int[] A = { 20,30,80,45,12,6,5,80 };
		List<Integer> list = Arrays.asList(20,30,80,45,12,6,5,80);

		//Using for loop
		findMaximumProduct(A);

		//Using java 8
		findMaximumProduct(list);

		//using collction
		Collections.sort(list);

		int max1 =  list.get(list.size()-1);
		int max2 =    list.get(list.size()-2);

		System.out.println("  max1 :"+max1+"   max2  :"+max2 );

	}
}
