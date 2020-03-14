package outputs;


class A{
	int z;
	A(int x){
		z=x;
		System.out.println(z);
	}
}

 class B extends A {
	 B(){
		 super(4);
	 }
	public static void main(String args[]) {
		new B();
		
	}

}
