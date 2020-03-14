import java.util.function.Predicate;
public class TestPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p1=i->{
			//boolean flag=true;
			int count=0;
		for(int x=1;x<=i;x++) {
			if(i%x==0) {
				count++;
			}
		}
			if(count==2) {
				return true;
			}
			else
				return false;
		
		};
		String[] names= {"Aravind","Venkat","Kattappa"};
		Predicate<String> p2=str->str.charAt(0)=='K';
		for(String n:names) {
			if(p2.test(n)) {
				System.out.println(n);
			}
		}
		
	
		System.out.println(p1.test(6));

	}

}
