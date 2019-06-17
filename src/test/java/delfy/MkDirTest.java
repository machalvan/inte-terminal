package delfy;

import static org.junit.Assert.*;
import java.io.File;

import commands.Mkdir;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MakeDirectoryTest {
	private Mkdir mkdir;
	//private File workingDir = new File(testDirectory)
	private String validString = "OK";
	private String invalidString = null;
	private String invalidCharacterString = "~#=,?!";
	private String testDirectoryPath = "src/test/resources/testDir/";
	private File testDirectory = new File(testDirectoryPath);
	private String newDirectoryName = "newDir";
	private File newDirectory = new File(testDirectoryPath + newDirectoryName);

	@Before
	public void initialize(){
		mkdir = new Mkdir(testDirectory, testDirectoryPath);
	}

	@After
	public void tearDown() {
		newDirectory.delete();
	}

	@Test
	public void testCheckUserInput(){
		assertTrue(mkdir.checkUserInput(validString));
	}

	@Test
	public void testInvalidInputCheckUserInput(){
		assertFalse(mkdir.checkUserInput(invalidString));
	}

	@Test
	public void testIllegalCharacterInput(){
		assertFalse(mkdir.checkUserInput(invalidCharacterString));
	}

	@Test
	public void testContainsIllegals(){
		assertTrue(mkdir.containsIllegals(invalidCharacterString));
	}

	@Test
	public void testCreateDirectory(){
		assertTrue(mkdir.makeDirectory(new File(testDirectoryPath + newDirectoryName)));
	}

	@Test
	public void testDirectoryAlreadyExists(){
		assertTrue(mkdir.directoryAlreadyExists(testDirectory));
	}
}
