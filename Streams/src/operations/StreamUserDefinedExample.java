package operations;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
class Company{
	String name;
	String version;
	int year;
	int price;
	@Override
	public String toString() {
		return "Company [name=" + name + ", version=" + version + ", year=" + year + ", price=" + price + "]";
	}
	Company(String name,String version,int year,int price){
		this.name=name;
		this.version=version;
		this.year=year;
		this.price=price;
		
		
	}
	
}
public class StreamUserDefinedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company c1=new Company("Hyundai","Eltos",2020,500000);
		Company c2=new Company("Toyota","Fortuner",2020,1500000);
		Company c3=new Company("Tata","Indica",2020,400000);
		Company c4=new Company("Maruthi","Dezire",2020,450000);
		ArrayList<Company> al=new ArrayList<Company>();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		al.add(c4);
		List<Company> list=al.stream().sorted((a,b)->a.name.compareTo(b.name)).collect(Collectors.toList());
		System.out.println(list);

	}

}
