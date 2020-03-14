package binary;

public class BinarySearch {
	
public int binarySearch(int a[],int lower,int high,int key) {
	int mid = 0;	
	if(high>=lower) {
	 mid=lower+(high-lower)/2;
	}
	if(a[mid]== key)
		return mid;
	
	if(a[mid]>key)
		return binarySearch(a, lower, mid - 1, key);
	
	    return binarySearch(a, mid + 1, high, key);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearch bs=new BinarySearch();
		int a[]= {10,20,30,40,50,60,70,80,90,100};
		int n=a.length;
		int key = 90;
		int result = bs.binarySearch(a, 0, n - 1, key);
		if (result == -1)
		System.out.println("Element not present");
		else
		System.out.println("Element found at index " + result);
		
		
	}

}
