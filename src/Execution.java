import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

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
			
			
			Execution.execution(itemsInLine);
	
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			;
		}
	}
	
	public static void execution(ArrayList<ArrayList<String>> itemsInLine) {
		Robot robot = new Robot();
		
		try {
			for (int i = 0; i< itemsInLine.size(); i++) {
				ArrayList<String> items = itemsInLine.get(i);
				
				switch (items.get(0).toUpperCase()) {
				
				case "PLACE" :
					robot.PLACE(Integer.parseInt(items.get(1)), Integer.parseInt(items.get(2)), items.get(3));
					break;
					
				case "MOVE" :
					robot.MOVE();
					break;
				
				case "LEFT" :
					robot.LEFT();
					break;
					
				case "RIGHT" :
					robot.RIGHT();
					break;
					
				case "REPORT" :
					robot.REPORT();
					break;
					
				default:
					System.out.println("Please enter right command");
					break;
				}
					
			}
			
		} catch (java.lang.NullPointerException e) {
			System.out.println("Please place toy robot first");
		}
	}

	

	public static ArrayList<String> lineSeparator(String line) {
		String[] item = {};
		ArrayList<String> itemsInLine = new ArrayList<String>();
		line = line.trim();
		item = line.split("\\s*,\\s|\\s+|,");
		for (int i = 0; i <item.length; i++) {
			itemsInLine.add(item[i]);
		}
		
		return itemsInLine;
	}





}
