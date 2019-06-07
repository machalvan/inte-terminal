package delfy;

import static org.junit.Assert.*;
import java.io.File;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MakeDirectoryTest {
	private MakeDirectory makeDirectory;
	private String validString = "OK";
	private String invalidString = null; 
	private String invalidCharacterString = "~#=,?!";
	private String testDirectoryPath = "src/test/resources/testDir/";
	private File testDirectory = new File(testDirectoryPath);
	private String newDirectoryName = "newDir";
	private File newDirectory = new File(testDirectoryPath + newDirectoryName);

	@Before 
	public void initialize(){
		makeDirectory = new MakeDirectory(testDirectoryPath);
	}

	@After
	public void tearDown() {
		newDirectory.delete();
	}
	
	@Test 
	public void testCheckUserInput(){
		assertTrue(makeDirectory.checkUserInput(validString));
	}
	
	@Test 
	public void testInvalidInputCheckUserInput(){
		assertFalse(makeDirectory.checkUserInput(invalidString));
	}
	
	@Test
	public void testIllegalCharacterInput(){
		assertFalse(makeDirectory.checkUserInput(invalidCharacterString));
	}
	
	@Test 
	public void testContainsIllegals(){
		assertTrue(makeDirectory.containsIllegals(invalidCharacterString));
	}
	
	@Test 
	public void testCreateDirectory(){
		assertTrue(makeDirectory.createNewDirectory(testDirectoryPath + newDirectoryName));
	}
	
	@Test 
	public void testDirectoryAlreadyExists(){
		assertTrue(makeDirectory.directoryAlreadyExists(testDirectory));
	}
}
