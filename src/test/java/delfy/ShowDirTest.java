package delfy;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Ignore;
import org.junit.Test;

public class ShowDirTest {


	@Test
    @Ignore
	public void testCurrentDir() {
		ShowDir dir = new ShowDir();
		File path = new File(System.getProperty("user.dir"));
		assertEquals("C:\\Users\\Örn\\workspace\\INTE test",dir.getCurrentDir(path));
	}

}
