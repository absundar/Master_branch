package ProgramsPractice.ProgramsPractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FindTextInFile {
	    public static void main(String[] args) throws IOException {
	        String filePath = "C:\\Users\\abhin\\OneDrive\\Documents\\Abhinaya.txt"; // Replace with your file path
	        String searchText = "Abhi";
	        BufferedReader reader = new BufferedReader(new FileReader(filePath));
	        String line;
	        while ((line = reader.readLine()) != null) {
	            if (line.contains(searchText)) {
	                System.out.println("Text found in line: " + line);
	                break; // Stop searching after first occurrence (optional)
	            }
	        }
	        reader.close();
	    }
	}


