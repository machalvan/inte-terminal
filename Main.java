import java.io.File;


public class Main {

	public Main() {
		
	}
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}
	
	public void run() {
		TestDirectory td = new TestDirectory();
		td.createTempDir();
		
		File f = td.getFileLocation();
		
		printDir(f);
		
		f = cd(f, "folder1");
		
		System.out.println("\n \n");
		printDir(f);
	}
	/*
	 * Grundkommandon
	 */
	//LS-kommando
	File[] ls(File dir) {
		return dir.listFiles();
	}
	//CD-kommando
	File cd (File currDir, String jump) {
		return new File(currDir.getAbsolutePath()+"/"+jump);
	}
	//Printdir
	void printDir(File f) {
		for (int i = 0; i < ls(f).length; i++) {
			System.out.println(ls(f)[i].getName());
		}
		
	}

}
