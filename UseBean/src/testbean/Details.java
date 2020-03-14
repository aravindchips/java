package testbean;

class Details extends Thread{
	public void run() {
		System.out.println("Hi");
	}
	public static void main(String args[]) {
		Details d1=new Details();
		d1.start();
		System.out.println("one");
		d1.start();
		System.out.println("two");
		public void run() {
			System.out.println("thread");
		}
	
	}
}
