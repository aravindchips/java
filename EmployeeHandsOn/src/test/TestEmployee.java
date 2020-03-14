package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class UserMainCode{
	public static HashMap increaseSaleries(HashMap<Integer,String> hm1,HashMap<Integer,Integer> hm2) {
		HashMap<Integer,Integer> op=new HashMap<Integer,Integer>();
		Set keys=hm1.keySet();
		Iterator itr=keys.iterator();
		while(itr.hasNext()) {
			int id=(int)itr.next();
			String s=hm1.get(id);
			if(s.equalsIgnoreCase("manager")) {
				int newsal=hm2.get(id)+5000;
				op.put(id, newsal);
			}
		}
		return op;
	}
}

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,String> hm1=new HashMap<Integer,String>();
		HashMap<Integer,Integer> hm2=new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> hm3=new HashMap<Integer,Integer>();
		System.out.println("Enter no of entries");
		int entry=sc.nextInt();
		for(int i=0;i<entry;i++) {
			System.out.println("enter id");
			int id=sc.nextInt();
			hm1.put(id, sc.next());
			hm2.put(id, sc.nextInt());
		}
		hm3=(HashMap<Integer,Integer>)UserMainCode.increaseSaleries( hm1, hm2);
		System.out.println(hm3);

	}

}
