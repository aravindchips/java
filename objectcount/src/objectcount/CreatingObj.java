package objectcount;

public class CreatingObj {
	
	 static int count=0;
	CreatingObj(){
		
		count++;
		
	}
		
	public void showCount() {
		 System.out.println(count);
	}
	
	
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreatingObj cobj=new CreatingObj();
		cobj.showCount();
		CreatingObj cobj1=new CreatingObj();
		CreatingObj cobj2=new CreatingObj();
		CreatingObj cobj3=new CreatingObj();
		
		cobj3.showCount();
		

	}

}
