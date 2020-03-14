package categories;

import org.junit.experimental.categories.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(PerformanceTests.class)
@Suite.SuiteClasses({
	TestCategory1.class,
	TestCategory2.class
})

public class TestCategories {

}
