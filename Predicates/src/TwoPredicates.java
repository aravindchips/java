import java.util.function.Predicate;
public class TwoPredicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer>p1=i->(i>=20);
		Predicate<Integer>p2=i->(i%2==0);
		int values[]= {10,20,30,40};
		
		System.out.println(p1.and(p2).test(22));

	}

}
