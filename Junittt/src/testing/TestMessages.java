package testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMessages {
	@Test
	public void test1() {
		HelloWorld h=new HelloWorld();
		assertEquals("Hai Aravind",h.msg1());
	}

}
