package delfy;

import commands.Cd;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class CdTest {
    private String directoryPathTest;
    private File workingDirTest;
    private Cd cd;

    @Before
    public void initialize() {
        directoryPathTest = "src\\test\\resources\\testDir\\";
        workingDirTest = new File(directoryPathTest);
    }

    @Test
    public void previousDirCdTest() {
        String cdCommand = "..";
        String workingDirectory = System.getProperty("user.dir");
        String targetDirectory = workingDirectory + "\\" + "src\\test\\resources\\";
        cd = new Cd(workingDirTest, cdCommand);
        assertEquals(targetDirectory, cd.execute());
    }
}
