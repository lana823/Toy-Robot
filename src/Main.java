import java.io.File;

public class Main {
	
	public static void main (String[] args) {
		
		File readFile = new File(Settings.INPUT_FILE);
		Execution.reader(readFile);
	}

}
