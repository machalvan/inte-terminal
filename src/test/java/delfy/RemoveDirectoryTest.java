package delfy;

import commands.Rmdir;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class RemoveDirectoryTest {
    private String testDirectoryPath;
    private File removeDirectory;

    @Before
    public void setupDirForRemoval() {
        testDirectoryPath = "src/test/resources/testDirToRemove/";
        removeDirectory = new File(testDirectoryPath);
        removeDirectory.mkdir();
    }

    @Test
    public void removeDirectoryTest() {
        Rmdir rmdir = new Rmdir(removeDirectory, testDirectoryPath);
        assertTrue(rmdir.removeDirectory(removeDirectory));
    }
}
