package javaPrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.testng.annotations.Test;

public class ReadDataFromTextFile {
@Test
public void usingFileReaderAndBufferReader() throws IOException {
	FileReader fr= new FileReader("C:\\Users\\abhin\\OneDrive\\Documents\\Test.txt");
	BufferedReader br = new BufferedReader(fr);
	String str="";
	while((str = br.readLine())!=null) {  //readLine reads the first line from the txt file
		System.out.println(str);
	}
	br.close();
}
@Test
public void usingFileAndScannerClassWithLoop() throws FileNotFoundException {
	File file = new File("C:\\Users\\abhin\\OneDrive\\Documents\\Test.txt");
	Scanner scanner = new Scanner(file);
	while(scanner.hasNextLine()) {
		System.out.println(scanner.nextLine());
	}
	scanner.close();
}
@Test
public void usingFileAndScannerClassWithDelimiter() throws FileNotFoundException {
	File file = new File("C:\\Users\\abhin\\OneDrive\\Documents\\Test.txt");
	Scanner scanner= new Scanner(file);
	scanner.useDelimiter("\\Z");
	System.out.println(scanner.next());
}
}
