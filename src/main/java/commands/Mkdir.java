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
            File dirToBeMade = addStringToFilename(workingDir, data);
            makeDirectory(dirToBeMade);
        }

        return workingDir;
    }

    private boolean makeDirectory(File directory) {
        if (directoryAlreadyExists(directory)) {
            return false;
        } else {
            directory.mkdir();
            return directory.isDirectory();
        }
    }

    private boolean checkUserInput(String s){
        if (s == null){
            return false; //bad string
        } else {
            return !containsIllegals(s);
        }
    }

    private boolean containsIllegals(String stringToBeExamined) {
        String[] arr = stringToBeExamined.split("[~#@*+%{}<>\\[\\]|\"\\^=?!]", 2);
        return arr.length > 1;
    }

    private boolean directoryAlreadyExists(File filename){
        return filename.isDirectory();
    }
}
