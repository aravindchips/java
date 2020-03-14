package test;

public class PanDetails {
	public static int panValidating(String str) {
		int count=0;
		if(str.length()==10) {
			if(str.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) 
				count++;
			}
		return count;
	}

}
