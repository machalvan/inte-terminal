package delfy;

import java.io.File;
import java.util.Scanner;
import commands.Command;

public class Main {
	private Scanner keyboard;
	private String testDir = System.getProperty("user.dir") + "/tempTest";
	private File workingDir;

	//Setting up program
    public void setWorkingDir(String dir){
		workingDir = new File(testDir);
    	System.setProperty("user.dir", dir);
	}

	public void createTempDir(){
        TempFileDir.createTempDir(testDir);
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
    public String readCommandText(){
		keyboard = new Scanner(System.in);
		String workingPath = workingDir.getAbsolutePath();
		boolean nullCheck = true;
		String command = "";

		while(nullCheck) {
			System.out.print(workingPath + ">");
			if(keyboard.hasNextLine()) {
				command = keyboard.nextLine();
			}

			if (command != null && !command.isEmpty()) {
				nullCheck = false;
			}
		}
		return command;
	}

	public String commandInput() {
		Scanner keyboard = new Scanner(System.in);
		String command = keyboard.nextLine();

    	return command;
	}

    public void setUp(){
        createTempDir();
        setWorkingDir("\\tempTest");
        printAvailableCommands();
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
