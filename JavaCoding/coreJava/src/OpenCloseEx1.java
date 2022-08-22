
interface ValueComparator{
	
	int compare(int val1,int val2);
	
}

class ascComparator implements ValueComparator{

	@Override
	public int compare(int val1, int val2) {
		// TODO Auto-generated method stub
		return val1-val2;
	}
}

class descComparator implements ValueComparator{

	@Override
	public int compare(int val1, int val2) {
		// TODO Auto-generated method stub
		return val2-val1;
	}
	
}

class ArrayUtil1{
	
	public static final void sort(int a[],ValueComparator comparator) {
		
		for(int i =0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(comparator.compare(a[i], a[j])>0) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			
		}
		
	}
}

public class OpenCloseEx1{
	
	public static void main(String[] args) {
		
		int[] arr = {1,5,3,8,9};
		ArrayUtil1.sort(arr,new descComparator());
		for(int ele : arr) {
			System.out.println("elements in array   :"+ele);
		}
		
	}
}