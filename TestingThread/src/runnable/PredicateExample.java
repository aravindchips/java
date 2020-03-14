package runnable;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p= i->i%2!=0;
				
		
		System.out.println(p.test(10));
		Function<Integer,Double> area=r->3.14*r*r;
		System.out.println(area.apply(1));
		BiFunction<Integer,Integer,Integer> bi=(a,b)->(a>b?a:b);  
		System.out.println(bi.apply(10,20));

	}

}
