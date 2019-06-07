package delfy;

import static org.junit.Assert.*;
import java.io.File;
import org.junit.Before;
import org.junit.Test;

public class MakeDirectoryTest {
	private MakeDirectory myMake;
	private String validString = "OK";
	private String invalidString = null; 
	private String invalidCharacterString = "~#=,?!";
	private File filename = new File("Mapp1");
	
	@Before 
	public void initialize(){
		myMake = new MakeDirectory(validString);
		filename.mkdir();
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
		assertTrue(myMake.checkUserInput(validString));
	}
	
	@Test 
	public void testInvalidInputCheckUserInput(){
		assertFalse(myMake.checkUserInput(invalidString));
	}
	
	@Test
	public void testIllegalCharacterInput(){
		assertFalse(myMake.checkUserInput(invalidCharacterString));
	}
	
	@Test 
	public void testContainsIllegals(){
		assertTrue(myMake.containsIllegals(invalidCharacterString));
	}
	
	@Test 
	public void testCreateDirectory(){
		boolean myBool = myMake.createNewDirectory("Mapp2");
		assertTrue(myBool);
	}
	
	@Test 
	public void testDirectoryAlreadyExists(){
		assertTrue(myMake.directoryAlreadyExists(filename));
	}
}
