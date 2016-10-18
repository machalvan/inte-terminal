package delfy;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

public class MakeDirectoryTest {
	MakeDirectory myMake;
	private String validString = "OK";
	private String invalidString = null; 
	private String invalidCharacterString = "~#=,?!";
	private File filename = new File("Mapp1");
	
	@Before 
	public void initialize(){
		myMake = new MakeDirectory(validString);
	}

	@Test
	public void setInputTest(){
		assertEquals(validString, myMake.setUserInput(validString));

	}
	
	@Test
	public void getInputTest(){
		assertEquals("before input", myMake.getUserInput());
	}
	
	@Test 
	public void testCheckUserInput(){
		//fail("Not yet implemented")
		assertEquals(true, myMake.checkUserInput(validString));
	}
	
	@Test 
	public void testInvalidInputCheckUserInput(){
		assertEquals(false, myMake.checkUserInput(invalidString));
	}
	
	@Test
	public void testIllegalCharacterInput(){
		assertEquals(false, myMake.checkUserInput(invalidCharacterString));
	}
	
	@Test 
	public void testcontainsIllegals(){
		assertEquals(true , myMake.containsIllegals(invalidCharacterString));
	}
	
	@Test 
	public void testCreateDirectory(){
		boolean myBool = myMake.createNewDirectory("Mapp2");
		assertEquals(true, myBool);
	}
	
	@Test 
	public void testDirectoryAlreadyExists(){
		assertEquals(true, myMake.directoryAlreadyExists(filename));
	}
}
