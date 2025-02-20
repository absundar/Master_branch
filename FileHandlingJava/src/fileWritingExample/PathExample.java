package fileWritingExample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {

	public static void main(String[] args) throws IOException {
String location ="PathExample.txt";
String content= "Leela is my mother";
Path path = Paths.get(location);
Files.write(path, content.getBytes());
	}

}
