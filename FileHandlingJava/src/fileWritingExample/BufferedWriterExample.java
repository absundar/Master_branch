package fileWritingExample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

	public static void main(String[] args) throws IOException {
String location ="BufferedWriterExample.txt";
String content ="Abhi is a good girl";
FileWriter fileWriter = new FileWriter(location);
BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
bufferedWriter.write(content);
bufferedWriter.close();
	}

}
