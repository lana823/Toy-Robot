import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Execution {
	
	public static void reader (File inputFileName) {
		try {
			String line = "";
			ArrayList<ArrayList<String>> itemsInLine = new ArrayList<ArrayList<String>>();
			InputStreamReader inputStream = new InputStreamReader(
					new FileInputStream(inputFileName));
			BufferedReader reader = new BufferedReader(inputStream);
			
			while ((line = reader.readLine())!= null) { 
				ArrayList<String> items = new ArrayList<String>();
				items = Execution.lineSeparator(line);
				itemsInLine.add(items);
				
			}
			reader.close();
			
	
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			;
		}
	}

	

	public static ArrayList<String> lineSeparator(String line) {
		String[] item = {};
		ArrayList<String> itemsInLine = new ArrayList<String>();
		line = line.trim();
		item = line.split("\\s*,\\s|\\s+");
		for (int i = 0; i <item.length; i++) {
			itemsInLine.add(item[i]);
			System.out.println(item[i]);
		}
		
		return itemsInLine;
	}





}
