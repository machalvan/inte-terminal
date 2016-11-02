package delfy;

import static org.junit.Assert.*;

import org.junit.Test;

public class ATestClass {

	@Test
	public void createValidObject() {
		AClass instance = new AClass(1);
		assertEquals(2, instance.getValue());
	}

	
	@Test(expected=IllegalArgumentException.class)
	public void createInValidObject() {
		new AClass(-1);
	}

	@Test
	public void multipleCallsToGetValueIncreasesValue(){
		AClass instance = new AClass(0);
		assertEquals(1, instance.getValue());
		assertEquals(2, instance.getValue());
		assertEquals(3, instance.getValue());
	}
	
}
