package string;

public class UserMainCode{
	
	public static int countVowels(String str) {
	int count=0;
	String temp=str.toLowerCase();
    for(int x=0;x<str.length();x++) {
		if(temp.charAt(x) == 'a'||str.charAt(x) == 'e'||str.charAt(x) == 'i'||str.charAt(x) == 'o'||str.charAt(x) == 'u') {
		
			count++;
		
		}
    }
    return count;

}	
}
	
    

