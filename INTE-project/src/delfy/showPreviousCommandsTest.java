package delfy;



import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

public class showPreviousCommandsTest {
	showPreviousCommands sPC;
	
	@Before
	public void initialize(){
		sPC = new showPreviousCommands();
	}
	
	@Test
	public void createTextFileTest(){
		assertEquals(true, sPC.createTextFile());
	}

}
