import java.io.File;
import java.util.Scanner;

public class commandLineInt {
	
	private Scanner keyboard = new Scanner(System.in);
	private tempFileDir tempDir = new tempFileDir();
	private showDir getDir = new showDir();
	
	public commandLineInt(){
		
	}
	
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
	}
	
	public String readCommand(){
		boolean nullcheck = true;
		String command = null;
		while(nullcheck){
			System.out.print(getCurrentDir()+">");
			command = keyboard.nextLine();
			if(command == null || command.isEmpty()){
			}
			else{
				nullcheck = false;
			}
		}
		return command;
	}
	
	private void handleCommand(String command){
		switch (command){
		
			case "exit":
				exit();
				break;
				
			default:
				break;
		}
	}
	
	public void exit(){
		System.exit(0);
	}
	
	public void run(){
		setUp();
		while(true){
			String command = readCommand();
			handleCommand(command);
		}
	}
	
	public static void main(String[]args){
		commandLineInt cli = new commandLineInt();
		cli.run();
	}
	
}
