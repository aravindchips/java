package operations;
import java.util.Set;
import java.util.*;
import java.util.stream.Collectors;
class Products{
	int num,cost;
	String name;
	@Override
	public String toString() {
		return "Products [num=" + num + ", cost=" + cost + ", name=" + name + "]";
	}
	Products(int num,String name,int cost){
		this.num=num;
		this.cost=cost;
		this.name=name;
	}
}
public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Products> pl=new ArrayList<Products>();
		pl.add(new Products(1,"Apple",50000));
		pl.add(new Products(2,"Tata",77000));
		pl.add(new Products(3,"Samsung",60000));
		pl.add(new Products(4,"Sony",6000));
		
		Double avg=pl.stream().collect(Collectors.averagingDouble(p->p.cost));
		Products p=pl.stream().min((Products a,Products b)->a.cost<b.cost?-1:1).get();
		System.out.println(avg);
		//System.out.println(p);


	}

}
