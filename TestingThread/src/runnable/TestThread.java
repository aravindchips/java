package runnable;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = ()->{
			System.out.println("Inside the thread...");
			for(int i=0;i<10;i++)
				System.out.println(i);
		};
		Thread t = new Thread(r);
		t.start();

	}

}
