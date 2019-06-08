package delfy;

import java.io.File;
import java.io.IOException;

public class TestDirectory {
	private File mainDir;

	public TestDirectory() {

	}

	public File getFileLocation() {
		return mainDir;
	}
	
	public void createTempDir() {
		mainDir = new File(System.getProperty("user.dir") + "/tempTest");
		String absolutePath = mainDir.getAbsolutePath();

		try {
			createTempFile(3, mainDir);
			createTempFile (2, new File(absolutePath + "/folder1"));
			createTempFile (1, new File(absolutePath + "/folder1/folder2"));
			createTempFile (3, new File(absolutePath + "/folder3"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*
	public void createTempDir(File path) {
		File f = new File(path+"/tempTest");
		try {
			createTempFile(3, f);
				createTempFile (2, new File(f.getAbsolutePath()+"/folder1"));
					createTempFile (1, new File(f.getAbsolutePath()+"/folder1/folder2"));
				createTempFile (3, new File(f.getAbsolutePath()+"/folder3"));
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	*/
	
	private void createTempFile(int numberOfFiles, File path) throws IOException {
		path.mkdir();
		for (int i = 1; i <= numberOfFiles; i++) {
			File.createTempFile("testFile"+i, ".test", path).deleteOnExit();
		}
	}
	

}

