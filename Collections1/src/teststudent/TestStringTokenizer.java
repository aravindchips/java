package teststudent;

import java.util.Scanner;
import java.util.StringTokenizer;
public class TestStringTokenizer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String n = sc.nextLine();
		
	
		StringTokenizer st = new StringTokenizer(n, " ");
		StringBuffer sb = new StringBuffer();
		while (st.hasMoreTokens()) {
		String str1 = st.nextToken();
		String str2 = str1.substring(str1.length() - 1);
		String str3 = str2.toUpperCase();
		sb.append(str3).append("$");
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
		}
		 
		}


