package delfy;
import java.nio.file.*;

public class UserInteraction {
	private String myString;
	private String userInputString;

	public UserInteraction(String s){
		if(s == null){
			this.myString = "";
		}else{
			this.myString = s;
		}
	}
	
//	public static void main(String[] args){
//		
//	}

	public String getString() {
		return myString;
	}
	
	public String setUserInput(String s){
		return null;
	}
	
	public String getUserInput(){
		return null;
	}
}
