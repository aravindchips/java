package commonelements;

public class SumOfCommon 
{
	
	public void test() {
	int [] arr= {10,20,30,40,50};
	int [] arr1= {30,100,40,50,60,10};
	int sum=0;
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr1.length;j++) {
			if(arr[i]==arr1[j]) {
				sum=sum+arr1[j];
			}
		}
		
	}
	System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SumOfCommon soc=new SumOfCommon();
		soc.test();

	}

}