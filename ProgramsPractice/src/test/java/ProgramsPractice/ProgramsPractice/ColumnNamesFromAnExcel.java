package ProgramsPractice.ProgramsPractice;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook; 
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ColumnNamesFromAnExcel {
    public static void main(String[] args) throws IOException {
        String excelFilePath = "C:\\Users\\abhin\\OneDrive\\Documents\\Home.xlsx"; // Replace with the actual path
        List<String> columnNames = getColumnNames(excelFilePath);
        if (columnNames != null) {
            System.out.println("Column Names:");
            for (String columnName : columnNames) {
                System.out.println(columnName);
            }
        }
    }
    public static List<String> getColumnNames(String excelFilePath) throws IOException {
        List<String> columnNames = new ArrayList<>();

        try (FileInputStream inputStream = new FileInputStream(excelFilePath);
             Workbook workbook = new XSSFWorkbook(inputStream)) { // Corrected syntax here
            Sheet sheet = workbook.getSheetAt(0); // Get the first sheet (index 0)
            Row headerRow = sheet.getRow(0); // Get the first row (usually the header row)
            if (headerRow != null) {
                for (Cell cell : headerRow) {
                    String columnName;
                    if (cell.getCellType() == CellType.STRING) { // Check if it's a string cell
                        columnName = cell.getStringCellValue();
                    } else if (cell.getCellType() == CellType.NUMERIC) { // Check if it's numeric
                        double numericValue = cell.getNumericCellValue();
                        columnName = String.valueOf(numericValue); // Convert number to string
                        // Or, format the number as needed:
                        // columnName = new DecimalFormat("#.##").format(numericValue);
                    } else {
                        columnName = ""; // Or handle other cell types as needed
                    }
                    columnNames.add(columnName);
                }
                return columnNames;
            } else {
                System.err.println("Header row (first row) is missing in the Excel sheet.");
                return null; // Return null if the header row is missing
            }
        } catch (IOException e) {
            System.err.println("Error reading Excel file: " + e.getMessage());
            return null; // Return null if there's an error
        }
    }
}