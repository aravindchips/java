package teststudent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No Of Students");
		int n=sc.nextInt();
		int max=0;
		String topper=null;
		System.out.println("Enter the details");
		for(int i=1;i<=n;i++) {
			ar.add(sc.next());
		}
		System.out.println(ar);
		Iterator itr=ar.iterator();
		while(itr.hasNext()) {
			String temp=(String) itr.next();
			StringTokenizer stk=new StringTokenizer(temp,"-");
			String name=stk.nextToken();
			int m1=Integer.parseInt(stk.nextToken());
			int m2=Integer.parseInt(stk.nextToken());
			int m3=Integer.parseInt(stk.nextToken());
			int total=m1+m2+m3;
			if(total>=max) {
				max=total;
				topper=name;
			}
		}
		System.out.println("Topper is "+topper+"with marks"+max);

	}

}
