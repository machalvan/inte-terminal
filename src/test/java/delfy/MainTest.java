package delfy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MainTest {
	private Main main = new Main();
	private String currentDir = "\\tempTest";

	@Before
	public void initialize() {
		System.setProperty("user.dir", currentDir);
	}
}
