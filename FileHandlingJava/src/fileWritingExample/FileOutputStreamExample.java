package fileWritingExample;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

	public static void main(String[] args) throws IOException {
String location= "FileOutputStreamExample.txt";
String content = "Ragav is the best";
FileOutputStream fileOutputStream = new FileOutputStream(location);
byte[] writeThis =content.getBytes();
fileOutputStream.write(writeThis);
fileOutputStream.close();
	}

}
