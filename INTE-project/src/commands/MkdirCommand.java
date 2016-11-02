
package commands;
//TODO gör om enligt Solos modell


import java.io.File;

//Ta in namnval fr användare 
//Kontrollera namnval - check 
//Metod som tittar om mappen redan finns - check
//
//Skapa mapp - check
//Returnera info om ny mapp  - Eller error om mappen redan existerar

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MkdirCommand{ //extends command
	private String userInputString = "before input";
	private File directory; 
	
	//konstruktor 
	public MkdirCommand(String s){
		//super(workingDir);
		setUserInput(s);
		if(checkUserInput(s)){
			createNewDirectory(userInputString);
		}
		else {
			System.out.println("Bad string");
		}
	}

	public String setUserInput(String s){
		this.userInputString = s; 
		return userInputString;
	}
	
	public String getUserInput(){
		return userInputString;
	}
	
	public boolean checkUserInput(String s){
		if(s == null){
			return false; //bad string
		}
		else if(containsIllegals(s)){
			return false;
		}
		else{
			return true;
		}
	}

	public boolean containsIllegals(String stringToBeExamined) {
		String[] arr = stringToBeExamined.split("[~#@*+%{}<>\\[\\]|\"\\^=?!]", 2);
		return arr.length > 1;
	}
	
	public boolean createNewDirectory(String filename){
		File dir = new File(filename);
		this.directory = dir; 
		return dir.mkdir();
		
		//return directory.isDirectory();
	}
	
	public boolean directoryAlreadyExists(File filename){
		return filename.isDirectory();
	}
	
}
