package delfy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CommandLineIntTest {
	private CommandLineInt cli = new CommandLineInt();
	private String currentDir;

	@Before
	public void initialize() {
		currentDir = System.getProperty("user.dir");
	}

	@Test
	public void setDirTest() {
		assertEquals("/tempTest", cli.setWorkingDir());
	}

	@Test
	public void checkDirTest(){
		assertEquals(currentDir, cli.getCurrentDir());
	}
}
