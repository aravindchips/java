package linearsearch;

public class UseMainCode {
	
	public static int  findElement(int key) {
		int[] arr= {10,20,30,40,50,60,70,80,90,100};
		int count=0;
		
		for(int x=0;x<arr.length;x++) {
			if(arr[x]==key)
			{
				count++;
			}
		
		}
		if(count==1)
			return 1;
		else
			return 0;
	}

}
