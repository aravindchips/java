package categories;

import org.junit.Test;
import org.junit.experimental.categories.Category;


public class TestCategory2 {
	@Category(RegressionTests.class)
	@Test
	public void test() {
		System.out.println("Hai i am from performance category at class level...");
	}

}
