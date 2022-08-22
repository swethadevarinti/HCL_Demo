

class ArrayUtil{
	
	public static void sort(int a[]) {

		for(int i =0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}

	}
	public static void dscSort(int a[]) {

		for(int i =0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}

	}
}

public class OpenCloseEx{
	
	public static void main(String[] args) {
		
		int[] arr = {1,5,3,8,9};
		ArrayUtil.dscSort(arr);
		for(int ele : arr) {
			System.out.println("elements in array   :"+ele);
		}
		
	}
}