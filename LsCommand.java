import java.io.File;


public class LsCommand extends Command {

	File file;
	public LsCommand(File file) {
		this.file = file;
	}
	public void execute() {
		for (int i = 0; i < file.listFiles().length; i++) {
			System.out.println(file.listFiles()[i]);
		}
	}

}
