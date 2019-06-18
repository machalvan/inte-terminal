package delfy;

import commands.Exit;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

public class ExitTest {
    private Exit exit;
    private String testDirectoryPath = "src/test/resources/testDir/";
    private File testDirectory = new File(testDirectoryPath);

    @Before
    public void initialize() {
        System.setSecurityManager(new ExitSecurityManager());
    }

    @Test
    public void systemExitTest() {
        try {
            exit = new Exit(testDirectory);
            exit.execute();
        } catch(ExitSecurityManager.ExitSecurityException e) {
            int status = e.getStatus();
            Assert.assertEquals(0, status);
        }
    }

    @After
    public void cleanUp() {
        System.setSecurityManager(null);
    }
}