package delfy;

import java.io.File;
import java.util.Scanner;

import commands.Command;




public class commandLineInt {
	
	
	private Scanner keyboard = new Scanner(System.in);
	
	private tempFileDir tempDir = new tempFileDir();
	private showDir getDir = new showDir();
	
	private File workingDir;
	
	//Constructor
	public commandLineInt(){
		
	}
	
	//Setting up program
	public String setWorkingDir(){
		System.setProperty("user.dir", "/tempTest");
		return System.getProperty("user.dir");
	}
	public String getCurrentDir(){
		String curDir = "";
		File path = new File(System.getProperty("user.dir"));
		curDir = getDir.getCurrentDir(path);
		return curDir;
	}
	public void createTempDir(){
		tempDir.createTempDir();
	}
	
	public void setUp(){
		createTempDir();
		setWorkingDir();
		getCurrentDir();
		workingDir = new File(tempFileDir.testFileDir);
		//TODO skapa en textfil för att lagra alla kommandon (för uppåtpil)
	}
	
	
	//Running the program
	public String readCommandText(){
		boolean nullcheck = true;
		String command = null;
		System.out.print(workingDir.getAbsolutePath()+">");
		while(nullcheck){
			
			command = keyboard.nextLine();
			if(command == null || command.isEmpty()){
			}
			else{
				nullcheck = false;
			}
		}
		return command;
	}
	
	/*private void handleCommand(String command){
		switch (command){
		
			case "exit":
				exit();
				break;
				
			default:
				break;
		}
	}*/
	
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
