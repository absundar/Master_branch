package fileReadingExample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) throws IOException {
String location ="BufferedWriterExample.txt";
FileReader fileReader = new FileReader(location);
BufferedReader reader = new BufferedReader(fileReader);
String currentLine;
while((currentLine=reader.readLine())!=null) {
	System.out.println(currentLine);

	}
	}
}
