package test;

import java.util.Scanner;

public class Voting {
	public void testAge() throws InvalidAgeException,InsufficientAgeException{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter ur age");
	int age=sc.nextInt();
	if(age<0)
		throw new InvalidAgeException();
	else if(age<18)
		throw new InsufficientAgeException();
	else if(age>=18 && age<=100)
		System.out.println("U are eligible to vote");
	else
		System.out.println("Please enter age in number only.....");

}
}
