package commands;

import java.io.File;

public class Mkdir extends Command {
    private String data;

    public Mkdir(File workingDir, String data) {
        super(workingDir);
        this.data = data;
    }

    public File execute() {
        if (checkUserInput(data)) {
            File dirToBeMade = addFileStringToWorkingDir(data);
            makeDirectory(dirToBeMade);
        }

        return workingDir;
    }

    public boolean makeDirectory(File directory) {
        if (directoryAlreadyExists(directory)) {
            return false;
        } else {
            directory.mkdir();
            return directory.isDirectory();
        }
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

    public boolean directoryAlreadyExists(File filename){
        return filename.isDirectory();
    }
}
