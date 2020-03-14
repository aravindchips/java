package test;

import java.util.Scanner;

public class TestPanCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PanDetails pdt=new PanDetails();
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the pancard number");
        String str=sc.next();
        int count=pdt.panValidating(str);
        if(count==1)
        	System.out.println("valid pan card");
        else
        	System.out.println("Not valid pan card");
	}
}

			 


