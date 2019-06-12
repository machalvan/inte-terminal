package delfy;

import static org.junit.Assert.*;

import delfy.commandLineInt;
import org.junit.Test;

public class commandLineIntTest {

	commandLineInt cli = new commandLineInt();

	@Test
	public void setDirTest() {
		assertEquals("/tempTest",cli.setWorkingDir());
	}

	@Test
	public void checkDirTest(){
		assertEquals("/tempTest",cli.getCurrentDir());
	}

}
