package categories;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestCategory1 {
	@Category(RegressionTests.class)
	@Test
	public void test() {
		System.out.println("Hai i am from regression method from testcategory1 class...");
		
	}
	@Category(PerformanceTests.class)
	@Test
	public void test1() {
		System.out.println("Hai i am performance test from testcategory1.class....");
	}

}