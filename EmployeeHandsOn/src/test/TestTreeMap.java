package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
class UserMainCode2 {
	
	public static int sum(TreeMap<Integer,Integer>hm) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		Set s=hm.entrySet();
		Iterator itr=s.iterator();
		int sum=0;
		while(itr.hasNext()) {
			Map.Entry me=(Map.Entry)itr.next();
			list.add((Integer) me.getValue());
		}
		Collections.sort(list);
		for(int i=0;i<3;i++) {
			sum=sum+(int)list.get(i);
		}
		return sum;
	}
	
	}

public class TestTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		TreeMap<Integer,Integer>hm=new TreeMap<Integer,Integer>();
		for(int i=0;i<n;i++) {
			hm.put(sc.nextInt(), sc.nextInt());
		}
		
	System.out.println(UserMainCode2.sum(hm));
	}
	}


