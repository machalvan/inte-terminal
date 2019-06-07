package delfy;

import java.io.File;

//Ta in namnval fr�n anv�ndare
//Kontrollera namnval - check 
//Metod som tittar om mappen redan finns - check
//
//Skapa mapp - check
//Returnera info om ny mapp  - Eller error om mappen redan existerar

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MakeDirectory {
	private String userInputString = "before input";
	private File directory; 

	public MakeDirectory(String s){
		setUserInput(s);

		if(checkUserInput(s)){
			createNewDirectory(userInputString);
		}
		//skriv ut till anv�ndaren 
	}

	public String setUserInput(String s){
		this.userInputString = s; 
		return userInputString;
	}
	
	public String getUserInput(){
		return userInputString;
	}
	
	public boolean checkUserInput(String s){
		if (s == null){
			return false; //bad string
		} else {
			return !containsIllegals(s);
		}
	}

	public boolean containsIllegals(String stringToBeExamined) {
		String[] arr = stringToBeExamined.split("[~#@*+%{}<>\\[\\]|\"\\^=?!]", 2);
		return arr.length > 1;
	}
	
	public boolean createNewDirectory(String filename){
		this.directory = new File(filename);
		
		if (directoryAlreadyExists(directory)) {
			return false; 
		} else {
			directory.mkdir();
			return directory.isDirectory();
		}
	}
	
	public boolean directoryAlreadyExists(File filename){
		return filename.isDirectory();
	}
	
}