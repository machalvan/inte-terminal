package test.java.delfy;



import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

public class showPreviousCommandsTest {
	delfy.showPreviousCommands sPC;

	@Before
	public void initialize(){
		sPC = new delfy.showPreviousCommands();
	}

	@Test
	public void createTextFileTest(){
		//assertEquals(true, sPC.createTextFile());
	}

}
