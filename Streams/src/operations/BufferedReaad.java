package operations;
import java.io.*;
public class BufferedReaad {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try(InputStreamReader ipr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(ipr)){
			
			System.out.println("Enter Marks Of Student");
			int m1=Integer.parseInt(br.readLine());
		}
		

	}

}