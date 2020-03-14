package examples;

public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hai Aravind Welcome to Java");
		int a=10;
		float b=10.00F;
		float c=a+b;
		String[] names=new String[3];
		names[0]="Red";
		names[1]="Black";
		names[2]="white";
		for(String name:names) {
			System.out.println("This is the output"+name);
		}
		System.out.println(c);
		String str1=new String("Hello");
		String str2=new String("Hello");
		System.out.println(str1);
		System.out.println(str2);
		if(str1.equals(str2))
			System.out.println("yes equal");
		if(str1==str2)
			System.out.println("yes");
		else
			System.out.println("no");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		if(str1.compareTo(str2)<0) {
			System.out.println("Str1 comes first");
		}
		else if(str1.compareTo(str2)>0) {
			System.out.println("str2 is first");
		}
		else {
			System.out.println("both are in same order");
		}
	}

}
