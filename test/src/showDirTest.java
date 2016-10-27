import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class showDirTest {
		
	
	@Test
	public void testCurrentDir() {
		showDir dir = new showDir();
		File path = new File(System.getProperty("user.dir"));
		assertEquals("C:\\Users\\Örn\\workspace\\INTE test",dir.getCurrentDir(path));
	}

}
