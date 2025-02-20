package javaPrograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.testng.annotations.Test;

public class WriteDataIntoATextFile {
@Test
public void write() throws IOException {
	FileWriter fw = new FileWriter("C:\\Users\\abhin\\OneDrive\\Documents\\Test123.txt");
	BufferedWriter bw= new BufferedWriter(fw);
	bw.write("Things to mainly plan for automation");
	bw.write("Reading file from path");
	bw.write("AWS login automation- for this check with Alby");
	bw.close();
}
}
