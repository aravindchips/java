import java.util.Scanner;

class UserMainCode{
	public static String getString(String takein) {
		int length=takein.length();
		char[] ch=new char[length];
		ch=takein.toCharArray();
		String str="";
		if(ch[0]=='j') 
			str=str+ch[0];
		if(ch[1]=='b')
			str=str+ch[1];
		for(int i=2;i<length;i++) 
			str=str+ch[i];
		return str;
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String takein=sc.nextLine();
		String sendout=UserMainCode.getString(takein);
		System.out.println(sendout);

	}

}
