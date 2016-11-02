package commands;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MkdirCommandTest {
	MkdirCommand myMake;
	private String validString = "OK";
	private String invalidString = null; 
	private String invalidCharacterString = "~#=,?!";
	public File filename = null;
	
	@Before 
	public void initialize(){
		//myMake = new MkdirCommand(filename, validString);
		myMake = new MkdirCommand(validString);
		filename = new File ("Mapp1");
		filename.deleteOnExit();
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
	public void testIllegalDirectory(){
		MkdirCommand aMake = new MkdirCommand(null);
		assertEquals(false, aMake);
	}
	
	@Test 
	public void testDirectoryAlreadyExists(){
		assertEquals(true, myMake.directoryAlreadyExists(filename));
	}
	
	
	
	/*@Test(expected = SecurityException.class)
	public void testInvalidDirectory(){
		//File testFile = new File ("Deny/Mapp");
		myMake.createNewDirectory("Deny/Mapp");
	}*/

}
