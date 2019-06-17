package delfy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CommandLineIntTest {
	private CommandLineInt cli = new CommandLineInt();
	private String currentDir = "\\tempTest";

	@Before
	public void initialize() {
		//currentDir = System.getProperty("user.dir");
	}

	@Test
	public void setWorkingDirTest() {
		assertEquals(currentDir, cli.setWorkingDir());
	}

	@Test
	public void checkDirTest(){
		assertEquals(currentDir, cli.getCurrentDir());
	}
}
