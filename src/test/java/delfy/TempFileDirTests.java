package delfy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;

import static org.junit.Assert.*;

public class TempFileDirTests {
    private File testDir;
    private String testDirPath;

    public void fileRemoval(File testDir) {
        File[] contents = testDir.listFiles();
        if (contents != null) {
            for (File f : contents) {
                if (! Files.isSymbolicLink(f.toPath())) {
                    f.delete();
                }
                if(f.isDirectory()) {
                    fileRemoval(f);
                }
            }
        }
        try {
            testDir.delete();
        } catch(SecurityException e) {
            e.printStackTrace();
        }
    }

    @Before
    public void setup() {
        testDirPath = System.getProperty("user.dir") + "/tempTest";
        testDir = new File(System.getProperty("user.dir") + "/tempTest");
        fileRemoval(testDir);
    }

    @Test
    public void fileExistBeforeTest() {
        assertFalse(testDir.exists());
    }

    @Test
    public void createTempDirTest() {
        File createdTestDir;
        TempFileDir.createTempDir(testDirPath);
        createdTestDir = new File(System.getProperty("user.dir") + "/tempTest" + "/folder1");
        assertTrue(createdTestDir.exists());
        createdTestDir = new File(System.getProperty("user.dir") + "/tempTest" + "/folder1" + "/folder2");
        assertTrue(createdTestDir.exists());
        createdTestDir = new File(System.getProperty("user.dir") + "/tempTest" + "/folder3");
        assertTrue(createdTestDir.exists());
    }

    @After
    public void cleanUp() {
        fileRemoval(testDir);
    }
}
