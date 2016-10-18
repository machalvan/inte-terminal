import static org.junit.Assert.*;

import org.junit.Test;

public class commandLineIntTest {
	
	commandLineInt cli = new commandLineInt();
	
	@Test
	public void setDirTest() {
		assertEquals("/tempTest",cli.setWorkingDir());
	}
	
	@Test
	public void checkDirTest(){
		assertEquals("\\tempTest",cli.getCurrentDir());
	}
	
	/*@Test
	public void readCommandTest(){
		assertEquals("lol",cli.readCommand());
	}
	
	@Test
	public void handleCommandTest(){
//		do test
	}*/
	
}
