package delfy;

import java.io.File;
import java.io.IOException;

public class TempFileDir {
	//Skapar ett temporärt mappsystem

	static void createTempDir(String testFileDir) {
		File file = new File(testFileDir);
		String path = file.getAbsolutePath();
        file.deleteOnExit();

		try {
			createTempFile(3, file);
            createTempFile (2, new File(path + "/folder1"));
            createTempFile (1, new File(path + "/folder1/folder2"));
            createTempFile (3, new File(path + "/folder3"));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void createTempFile(int numberOfFiles, File path) throws IOException {
		if (!path.exists()) {
			path.mkdir();
		}

		for (int i = 1; i <= numberOfFiles; i++) {
			File f = File.createTempFile("testFile" + i, ".test", path);
            f.deleteOnExit();
		}
	}
}
