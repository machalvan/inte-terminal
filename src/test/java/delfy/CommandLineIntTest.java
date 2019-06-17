package delfy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CommandLineIntTest {
	private CommandLineInt cli = new CommandLineInt();
	private String currentDir = "\\tempTest";

	@Before
	public void initialize() {
		System.setProperty("user.dir", currentDir);
	}

	@Test
	public void checkDirTest(){
		assertEquals(currentDir, cli.getCurrentDir());
	}
}
