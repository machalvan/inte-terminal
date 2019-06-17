package delfy;

import java.io.File;
import java.util.Scanner;
import commands.Command;

public class Main {
	private Scanner keyboard = new Scanner(System.in);
	private TempFileDir tempDir = new TempFileDir();
	private File workingDir;

	//Setting up program
    private void setWorkingDir(String dir){
		System.setProperty("user.dir", dir);
	}

	String getCurrentDir(){
		File path = new File(System.getProperty("user.dir"));
		return path.toString();
	}

	public void createTempDir(){
		tempDir.createTempDir();
	}

	private void printAvailableCommands() {
		System.out.println("Available commands:");
		System.out.println("ls           List files and directories in current directory");
		System.out.println("cd <dir>     Change directory to specified directory");
		System.out.println("mkdir <dir>  Add specific directory");
		System.out.println("rmdir <dir>  Remove specific directory");
		System.out.println("exit         Exit this program");
		System.out.println();
	}

	//Running the program
    private String readCommandText(){
		boolean nullCheck = true;
		String command = null;
		System.out.print(workingDir.getAbsolutePath()+">");

		while (nullCheck) {
			if (keyboard.hasNextLine()) {
				command = keyboard.nextLine();
			}

			if (command != null && !command.isEmpty()) {
				nullCheck = false;
			}
		}

		return command;
	}

    public void setUp(){
        //createTempDir();
        setWorkingDir("\\tempTest");
        getCurrentDir();
        printAvailableCommands();
        workingDir = new File(TempFileDir.testFileDir);
        //TODO skapa en textfil för att lagra alla kommandon (för uppåtpil)
    }

	private void run(){
		setUp();

		while (true) {
			String commandText = readCommandText();
			workingDir = Command.getCommand(workingDir, commandText).execute();
		}
	}

	public static void main(String[]args){
		Main main = new Main();
		main.run();
	}
}
