package delfy;

import java.io.File;

//Ta in namnval från användare
//Kontrollera namnval - check 
//Metod som tittar om mappen redan finns - check
//
//Skapa mapp - check
//Returnera info om ny mapp  - Eller error om mappen redan existerar

public class MakeDirectory {
	public MakeDirectory(String directoryName){
		if (checkUserInput(directoryName)) {
			createNewDirectory(directoryName);
		}
		//skriv ut till användaren 
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
		File directory = new File(filename);
		
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
