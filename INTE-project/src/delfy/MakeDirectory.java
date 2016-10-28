
package delfy;



import java.io.File;

//Ta in namnval fr användare 
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
	
	//konstruktor 
	public MakeDirectory(String s){
		setUserInput(s);
		if(checkUserInput(s)){
			createNewDirectory(userInputString);
		}
		//skriv ut till användaren 
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
		
		if(directoryAlreadyExists(directory)){
			return false; 
		}
		else{
			directory.mkdir();
			return directory.isDirectory();
		}
	}
	
	public boolean directoryAlreadyExists(File filename){
		return filename.isDirectory();
	}
	
}
