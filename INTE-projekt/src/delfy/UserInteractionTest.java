package delfy;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserInteractionTest {
	private String s = "En godk�nd str�ng";
	private UserInteraction myUser = new UserInteraction(null);

	@Test
	public void echoTest() {
		UserInteraction My = new UserInteraction(s);
		assertEquals(s, My.getString());
	}

	@Test
	public void nullTest(){
		UserInteraction My = new UserInteraction(null);
		assertEquals("", My.getString());
	}
	
	@Test
	public void testSetUserInput(){
		assertEquals("Input", My.setUserInput("check"));
	}
}
