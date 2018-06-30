import java.io.File;
import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		File readFile = new File(Settings.INPUT_FILE);
		Execution.reader(readFile);
	}

}
