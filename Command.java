import java.io.File;


public class Command {

	public Command() {
		
	}
	
	public static Command getCommand(File location, String input) {
		
		//Cmd & helper
		String cmd = input.substring(0, input.charAt(' '));
		String data = input.substring(input.charAt(' '));
		
		switch (cmd) {
		case "ls":
			return new LsCommand(location);
			
		
		default :
			System.out.println("Not a valid command");
			break;
		}
		
		return new Command();
	}
	
	
	
	public void execute() {
		System.out.println("This is the parent class, this shouldn't be executed");
	}

}
