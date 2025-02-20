package ProgramsPractice.ProgramsPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FilesComparisonIO {
	    public static void main(String[] args) throws IOException {
	        File file1 = new File("path/to/file1.txt");
	        File file2 = new File("path/to/file2.txt");
	        boolean areEqual = FileUtils.contentEquals(file1, file2); // Content comparison
	        System.out.println("Files are equal (contentEquals): " + areEqual);

	        boolean areEqualByteByByte = FileUtils.contentEqualsIgnoreEOL(file1, file2, null); // Ignore End of Line differences
	        System.out.println("Files are equal (contentEqualsIgnoreEOL): " + areEqualByteByByte);
	    }
	}

