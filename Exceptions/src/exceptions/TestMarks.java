package exceptions;

public class TestMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentMarks sm=new StudentMarks();
		try {
			sm.testMarks();
		}
		catch(NegativeValuesException ne) {
			System.out.println(ne);
		}
		catch(ValuesOutOfRangeException ve) {
			System.out.println(ve);
		}

	}

}
