package delfy;

import commands.Ls;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class LsTest {
    private Ls ls;
    private String testDirectoryPath = "src/test/resources/testDir/";
    private File testDirectory = new File(testDirectoryPath);

    @Before
    public void initialize(){
        ls = new Ls(testDirectory);
    }

    @Test
    public void testPrintFilesAndDirsInWorkingDir() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        ls.execute();

        assertEquals("anotherDir\ntestFile1\ntestFile2\n", outContent.toString().replace("\r", ""));
    }
}
