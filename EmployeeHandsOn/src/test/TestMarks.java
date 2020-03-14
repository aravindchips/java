package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
class Sort implements Comparable{
	public int getMks() {
		return mks;
	}
	public void setMks(int mks) {
		this.mks = mks;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	Integer mks;
	int rollno;
	public Sort(int rollno,int mks ){
		this.mks=mks;
		this.rollno=rollno;
	}
	public int compareTo(Sort s) {
		if(mks.compareTo(mks)<0) {
			return-1;
		}
		else if(mks.compareTo(mks)>0) {
			return 1;
		}
		else
			return 0;
	}
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class TestMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Map<Integer,Integer> tm=new TreeMap<Integer,Integer>();
		System.out.println("Enter no of entries");
		int entry=sc.nextInt();
		int sum=0;
		for(int i=0;i<entry;i++) {
			System.out.println("Enter rollno");
			int roll=sc.nextInt();
			System.out.println("Enter mks");
			int mks=sc.nextInt();
			tm.put(roll,mks);
		}
		Set key=tm.keySet();
		Iterator itr=key.iterator();
		while(itr.hasNext()) {
			Map.Entry me=(Map.Entry)itr.next();
			int mks=(int)me.getValue();
			
		}
		
		


}
}