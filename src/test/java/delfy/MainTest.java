package delfy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;

public class MainTest {
	private Main main;
	private String currentDir = "/tempTest";

	@Before
	public void initialize() {

		//System.setProperty("user.dir", currentDir);
	}

	@Test
	public void commandInputTest() {
		main = new Main();

		String inputCommand = "test command";
		InputStream in = new ByteArrayInputStream(inputCommand.getBytes());
		System.setIn(in);

		assertEquals("test command", main.commandInput());
	}

}
