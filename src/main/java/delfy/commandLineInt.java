package delfy;

import java.io.File;
import java.util.Scanner;
import commands.Command;

public class commandLineInt {
	private Scanner keyboard = new Scanner(System.in);
	private tempFileDir tempDir = new tempFileDir();
	private showDir getDir = new showDir();
	private File workingDir;

	public commandLineInt(){

	}

	//Setting up program
	public String setWorkingDir(){
		System.setProperty("user.dir", "/tempTest");
		return System.getProperty("user.dir");
	}

	public String getCurrentDir(){
		File path = new File(System.getProperty("user.dir"));
        return getDir.getCurrentDir(path);
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

	public void setUp(){
		//createTempDir();
		setWorkingDir();
		getCurrentDir();
		printAvailableCommands();
		workingDir = new File(tempFileDir.testFileDir);
		//TODO skapa en textfil för att lagra alla kommandon (för uppåtpil)
	}

	//Running the program
	public String readCommandText(){
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

	public void exit(){
		System.exit(0);
	}

	public void run(){
		setUp();

		while(true){
			String commandText = readCommandText();
			//handleCommand(command);
			workingDir = Command.getCommand(workingDir, commandText).execute();
		}
	}

	public static void main(String[]args){
		commandLineInt cli = new commandLineInt();
		cli.run();
	}
}
